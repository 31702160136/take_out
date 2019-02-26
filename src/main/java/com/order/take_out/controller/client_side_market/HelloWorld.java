package com.order.take_out.controller.client_side_market;

import com.order.take_out.pojo.client.UserOpenid;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.annotation.Around;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: take_out
 * @description: 项目欢迎
 * @author: Mr.Yang
 * @create: 2019-02-14 16:44
 **/

@RestController
@RequestMapping("/test")
public class HelloWorld {
    @RequestMapping("/hello")
    public String HelloWorld(){
        return "helloWord";
    }

//    @RequestMapping("/login")
//    @ResponseBody
//    public Map<String, Object> login(String username,String password){
//        Subject subject= SecurityUtils.getSubject();
//        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
//        try {
//            subject.login(token);
//        }catch (AuthenticationException e){
//            throw new RuntimeException("账号或密码错误:"+e.getMessage());
//        }
//        Map<String,Object> map=new LinkedHashMap<>();
//        map.put("success",subject.isAuthenticated());
//        return map;
//    }
}
