package com.company;

public class Main {

    public static void main(String[] args) {
       int[] arr  = {23,14,67,98,11,10,-34,76,-85,19};
       int target = -34;
       int ans = linearsearch(arr, target);
        System.out.println(ans);

    }

    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]== target){
               return i;
           }
        }
        return -1;
    }
}
