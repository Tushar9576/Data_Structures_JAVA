package com.company;

import java.util.Scanner;

public class returnstring {
    public static void main(String[] args) {
        //String msg = greet();
        //System.out.println(msg);
        //int s = Sum(20,30);
        //System.out.println(s);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String naam = in.next();
        String personalised = Mygreet(naam);
        System.out.println(personalised);
    }

     static String Mygreet(String name) {
        String msg = "Hello "+ name;
        return msg;
    }

    /*static String greet(){
        String greeting = "Hello! How are you?";
        return greeting;
    }*/

   /* static int Sum(int a, int b){
        int sum = a+b;
        return sum;
    }*/

}
