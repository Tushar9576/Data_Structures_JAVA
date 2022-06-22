package com.company;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun();
        multiple(2, "tushar");
     }

     static void multiple(int a, String ...z) {
    }

    static void fun(int ...x){
        System.out.println(Arrays.toString(x));

    }
}
