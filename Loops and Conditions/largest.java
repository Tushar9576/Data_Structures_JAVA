package com.company;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("please enter first number: ");
         int a = in.nextInt();
         System.out.print("please enter Second number: ");
         int b = in.nextInt();
        System.out.print("Please enter third number: ");
         int c = in.nextInt();

         // Find the largest of 3 numbers
       /* if(a>b & a>c ){
            System.out.println(a+" is the largest number");
        }
        else if (b>a & b>c){
            System.out.println(b+" is the largest number");
        }
        else{
            System.out.println(c+ " is the largest number");
        }*/
         int max = a;
         if (b>max){
             max=b;

         }
         if(c>max){
             max = c;
         }
        System.out.println(max+" is the largest number");
    }
}
