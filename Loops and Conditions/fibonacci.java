package com.company;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
         int n = in.nextInt();

         int a =0;
        int f = 0;
        int b=1;
        for (int i = 1; i <= n; i++) {
            f = a+b;
            a = b;
            b = f;
            System.out.println(a);

        }


    }
}
