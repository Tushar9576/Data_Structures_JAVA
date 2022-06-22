package com.company;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int a){
        if (a<= 1){
            return false;
        }
        int b = 2;
        while (b * b <= a){
            if(a %b == 0){
                return false;
            }
            b++;
        }
        return b * b > a;
    }
}
