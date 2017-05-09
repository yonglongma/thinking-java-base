package com.yonglong.thinking;

import java.util.Date;
import java.util.Properties;

/**
 * @author MaYongLong
 * @date 2017/5/8.
 */
public class Property {
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("-----Memory Usage");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory = "+ runtime.totalMemory() + "Free Memory = "+ runtime.freeMemory());

        try {
            Thread.currentThread().sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
