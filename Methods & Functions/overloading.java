package com.company;

public class overloading {
    public static void main(String[] args) {
        tushar(5);
        tushar("Tushar");
    }
    static void tushar(int a){
        System.out.println(a);
    }

    static void tushar(String name){
        System.out.println(name);

    }

}
