package com.company;

public class Main {

    public static void main(String[] args) {
        Pattern31(5);
    }
    static void Pattern31(int n){
        for (int row = 0; row <= 2*n; row++) {
            for (int col = 0; col <= 2*n; col++) {
                int index = n - Math.min(Math.min(row,col), Math.min(2*n-row, 2*n- col));
                System.out.print(index  + " ");
            }
            System.out.println();
        }
    }

    static void Pattern17(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int total;
            if(row > n){
                total = 2*n - row;
            }
            else {
                total = row;
            }
            int totalspaces = n - row;
            for (int s = 0; s < n-total ; s++) {
                System.out.print("  ");
            }
            for (int col = total; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= total; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    
    static void Pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int totalspaces = n - row;
            for (int s = 0; s < totalspaces ; s++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void Pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int total;
            if(row > n){
                total = 2*n - row;
            }
            else {
                total = row;
            }
            int noofspaces = n - total;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= total ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern5(int n){
        for (int row = 1; row < 2*n ; row++) {
            int total;
            if(row > n){
                total = 2*n - row;
            }
            else {
             total = row;
            }
            for (int col = 1; col <= total ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void Pattern4(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }

    static void Pattern3(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n+1-row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

    static void Pattern2(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

    static void Pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
