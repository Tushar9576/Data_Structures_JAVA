package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = in.nextInt();

      /*  for (int i = 0; i <= n; i++) {
            System.out.println(i);
*/
        int i =0;
        /*while (i <=n) {
            System.out.println(i);
            i++;
      */
        do{
            System.out.println(i);
            i++;
        }while (i<=n);


        }
    }



