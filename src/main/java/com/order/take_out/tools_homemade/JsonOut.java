package com.order.take_out.tools_homemade;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-03 18:36
 **/
public class JsonOut {
    public static Map<String,Object> print(Object obj){
        Map<String,Object> map=new LinkedHashMap<>();
        map.put("success",true);
        map.put("code",200);
        map.put("data",obj);
        return map;
    }
}
