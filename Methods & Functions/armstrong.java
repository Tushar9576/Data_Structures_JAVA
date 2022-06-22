package com.company;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        //System.out.println(isarm(n));

        for (int i = 100; i <= 1000; i++) {
            if (isarm(i)){
                System.out.print(i+ " ");
            }
        }
    }

     static boolean isarm(int n) {
         int sum = 0;
         int original = n;
        while (n > 0 ){
            int rem = n% 10;
            int cube = (rem * rem * rem);
            sum += cube;
            n = n/10;
        }
        return sum == original;
    }
}
