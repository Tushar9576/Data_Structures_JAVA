package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String fruit = in.next();

       /* switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("red and sweet");
            case "orange" -> System.out.println("round and juicy");
            case "Grapes" -> System.out.println("small");
            default -> System.out.println("enter a valid fruit");
        }*/

        int month = in.nextInt();
        switch(month){
            case 1 -> System.out.println("january");
            case 2 -> System.out.println("feb");
            case 3 -> System.out.println("march");
            case 4 -> System.out.println("april");
            case 5 -> System.out.println("may");
            case 6 -> System.out.println("june");
            case 7 -> System.out.println("july");
            case 8 -> System.out.println("august");
            case 9 -> System.out.println("sept");
            case 10 -> System.out.println("oct");
            case 11 -> System.out.println("nov");
            case 12 -> System.out.println("dec");
            default -> System.out.println("enter a number between 1 to 12");

        }




    }
}
