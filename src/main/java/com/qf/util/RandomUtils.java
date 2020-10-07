package com.qf.util;

import java.util.Random;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/7 13:01
 * @Description:
 */
public class RandomUtils {
    public  static String RandString(int length)
    {
        String charList = "0123456789";
        String rev = "";
        Random f = new Random();
        for(int i=0;i<length;i++)
        {
            rev += charList.charAt(Math.abs(f.nextInt())%charList.length());
        }
        return rev;
    }
}
