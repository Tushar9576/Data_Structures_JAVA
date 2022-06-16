package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        // type casting
//         int num = (int)(29.68f);
//        System.out.println(num);

        // Automatic type promotion in expression
//        int a = 256;
//        byte b = (byte)a;
//        int num = 'A';
//        System.out.println(num);
        byte b = 23;
        char c =  'a';
        short s = 1024;
        int i = 60000;
        float f = 123.45667f;
        double d =  0.12345;
        double result = (f * b) + (i / c) - (d-s);
        // float + int + double = double
        System.out.println((f * b) +" " + (i / c)+" " + (d-s));
        System.out.println(result);






    }
}
