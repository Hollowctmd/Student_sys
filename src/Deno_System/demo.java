package Deno_System;

import java.util.Properties;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        //获取系统当前属性
        Properties properties = System.getProperties ();
        System.out.println("/n"+properties);
        //获取当前系统属性的key，返回Set对象
        Set<String> propertynames = properties.stringPropertyNames();
        for (String key : propertynames) {
            //获取当前key对于的值
            String value = System.getProperty(key);
            System.out.println(key+"---->"+value);
        }
    }
}
