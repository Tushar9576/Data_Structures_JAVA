package com.company;

public class scoping {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        System.out.println(a);
    }
    {
            int c = 40;
        System.out.println(c);

    }

    }

