package com.order.take_out.controller_jsp;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-10 15:37
 **/
@Controller
@RequestMapping("/ftl")
public class Test {

    @RequestMapping("/")
    public String test(HttpServletRequest request){
        return "login";
    }

    public static void main(String[] args){
        Object object=123;
        String str = String.valueOf(object);
        System.out.println(str);
    }
}
