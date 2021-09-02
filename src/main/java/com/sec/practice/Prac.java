package com.sec.practice;

/**
 * @program: Gadgets
 * @description:
 * @author: 0range
 * @create: 2021-08-17 20:18
 **/


public class Prac {
    public static void main(String[] args) {
        String str = "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>";
        String s = str.split("\\:")[0];
        String replace = s.replace("<", "");
        System.out.println(replace);
    }
}
