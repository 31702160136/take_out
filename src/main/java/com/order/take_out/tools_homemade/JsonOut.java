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
    public static int TRUE=200;
    public static int FALSE=403;
    public static Map<String,Object> print(Object obj,int type){
        Map<String,Object> map=new LinkedHashMap<>();
        switch (type){
            case 200:
                map.put("success",true);
                map.put("code",TRUE);
                map.put("data",obj);
                break;
            case 403:
                map.put("success",true);
                map.put("code",FALSE);
                map.put("data",obj);
                break;
        }
        return map;
    }
}
