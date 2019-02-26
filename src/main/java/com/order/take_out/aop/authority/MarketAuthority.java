package com.order.take_out.aop.authority;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-26 19:30
 **/
@Aspect
@Configuration
public class MarketAuthority {

    @AfterReturning(value = "execution(* com.order.take_out.controller.client_side_market.LoginMarketController.login(..))",returning = "returnValue")
    public void loginInfo(JoinPoint jp,Object returnValue){
        Subject subject= SecurityUtils.getSubject();
        String str=Arrays.toString(jp.getArgs());
        String user=str.substring(str.indexOf("[")+1,str.indexOf(","));
        String value=returnValue.toString();
        String result=value.substring(value.lastIndexOf("success=")+"success=".length(),value.length()-1);
        if (result.equals("true")){
            System.out.println("用户："+ user+", "+"成功登陆市场管理后台");
        }else {
            System.out.println("用户："+ user+", "+"登陆失败");
        }
    }

    @Around(value = "execution(* com.order.take_out.controller.client_side_market.SelectMarketController.*(..))")
    public Object isLogin(ProceedingJoinPoint jp){
        Subject subject= SecurityUtils.getSubject();
        if (subject.isAuthenticated()){
            try {
                Object object=jp.proceed(jp.getArgs());
                return object;
            } catch (Throwable throwable) {
                throw new RuntimeException("发生错误:"+throwable.getMessage());
            }
        }else {
            throw new RuntimeException("未登录");
        }
    }
}
