package com.company;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Temperature in C: ");
        float temp_c = input.nextFloat();
        float temp_f = (temp_c * 9/5 ) + 32;
        System.out.println("Temperature in farenheit is "+temp_f);



    }
}
