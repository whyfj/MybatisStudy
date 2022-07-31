package com.kuang.util;

import java.util.UUID;

public class IDUtils {
    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
