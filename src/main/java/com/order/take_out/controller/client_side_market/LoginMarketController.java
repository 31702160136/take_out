package com.order.take_out.controller.client_side_market;

import com.order.take_out.pojo.client.UserOpenid;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: take_out
 * @description: 登录页接口
 * @author: Mr.Yang
 * @create: 2019-02-23 22:33
 **/
@RestController
@RequestMapping("/market_login")
public class LoginMarketController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(String username,String password){
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
        }catch (AuthenticationException e){
            subject.logout();
        }
        Map<String,Object> map=new LinkedHashMap<>();
        if (subject.isAuthenticated()){
            map.put("code",200);
        }else {
            map.put("code",403);
        }
        map.put("success",subject.isAuthenticated());
        return map;
    }
}
