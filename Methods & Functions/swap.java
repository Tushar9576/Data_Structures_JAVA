package com.company;

public class swap {
    public static void main(String[] args) {
        int c = 30;
        int d = 20;
        swap(c,d);

    }

    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
