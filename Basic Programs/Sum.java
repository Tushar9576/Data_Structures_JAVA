package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = input.nextInt();
        System.out.print("Please enter second number: ");
        int b = input.nextInt();
        int sum = a+b ;
        System.out.println("Sum of "+a+" and "+b+" is "+sum);
    }
}
