package com.order.take_out.controller;

import com.order.take_out.component.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
