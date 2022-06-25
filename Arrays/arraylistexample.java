package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(56);
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i)+" ");
        }
        

    }
}
