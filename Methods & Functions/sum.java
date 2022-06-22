package com.company;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        // Take input of two numbers and print the sum using methods
        Sum();
    }
    static void Sum(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : " +sum);
    }


}
