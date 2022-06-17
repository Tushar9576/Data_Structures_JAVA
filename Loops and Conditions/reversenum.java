package com.company;

import java.util.Scanner;

public class reversenum  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int n = in.nextInt();
        int ans = 0;
        //int n = 123456;
         while (n > 0){
             int rem = n%10;
             if (rem > 0){
                 ans = ans*10 + rem;
             }
             n /= 10;
         }
        System.out.println(ans);
    }
}
