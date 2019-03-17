package com.order.take_out.tools_homemade;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-17 21:44
 **/
public class Tools {
    public static String dateFormat(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }
}
