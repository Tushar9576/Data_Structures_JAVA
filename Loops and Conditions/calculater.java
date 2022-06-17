package com.company;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the first number :");
             int num1 = in.nextInt();
                System.out.print("Please enter the second number");
             int num2 = in.nextInt();

             if(op == '+'){
                 ans = num1 + num2;

             }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '%'){

                    ans = num1 % num2;
                }
                if(op == '/'){
                    if (num2 !=0) {
                        ans = num1 / num2;
                    }
                    else {
                        System.out.println("Cannot divide by zero");
                    }}}
                else if (op == 'X' || op == 'x'){
                        break;
                }
                    else{
                        System.out.println("Please enter correct operators");
                    }
                System.out.println(ans);

            }
        }
    }

