package com.order.take_out.controller.client_side_market;

import com.order.take_out.pojo.client.UserOpenid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/client_side_market")
public class LoginController {
    @RequestMapping("/login")
    public Map<String, Object> login(UserOpenid userOpenid){
        Map<String,Object> map=new LinkedHashMap<>();
        map.put("id",userOpenid.getId());
        map.put("openid",userOpenid.getOpenid());
        return map;
    }
}
