package com.order.take_out.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: take_out
 * @description: 异常处理
 * @author: Mr.Yang
 * @create: 2019-02-14 20:39
 **/
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest request,Exception e){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("success",false);
        map.put("errMessage",e.getMessage());
        return map;
    }
}
