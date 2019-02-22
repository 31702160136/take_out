package com.order.take_out.tools_homemade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @program: take_out
 * @description: 随机不重复编码
 * @author: Mr.Yang
 * @create: 2019-02-14 23:50
 **/

public class RandomCoding {
    private static final int LENGTH=30;
    private static final int LETTER_LENGTH=30;
    private static final char[] letter=
            {'q','w','e','r',
            't','y','u','i','o','p',
            'a','s','d','f','g','h',
            'j','k','l','z','x','c',
            'v','b','n','m'};
    public static String CreateNumber(){
        String code="";
        DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String date=sdf.format(new Date());
        Random random=new Random();
        String total="";
        for (int i=0;i<LETTER_LENGTH;i++){
            int rnd1=random.nextInt(26);
            int rnd2=random.nextInt(100);
            String str=String.valueOf(letter[rnd1]);
            if ((rnd1*rnd2)%2==0){
                str =str.toUpperCase();
            }
            total+=str;
        }
        char[] letter_arr=total.toCharArray();
        char[] date_arr=date.toCharArray();
        int letterCount=0;
        int datePotion=0;
        for (int i=0;i<LENGTH;i++){
            int rnd3=random.nextInt(50);
            int rnd4=random.nextInt(50);
            if (i%2==0&&letterCount<11){
                code+=String.valueOf(letter_arr[letterCount]);
                letterCount++;
            }else {
                code+=String.valueOf(date_arr[datePotion]);
                datePotion++;
            }
            if (code.length()==10||code.length()==20){
                code+="-";
            }
            if (code.length()>=30){
                break;
            }
        }
        return code;
    }
}
