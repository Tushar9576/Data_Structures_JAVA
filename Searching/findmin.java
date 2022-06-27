package com.company;

public class findmin {
    public static void main(String[] args) {
        int[] arr  = {23,14,67,98,-11,10,34,76,85,19};
        System.out.println(min(arr));
    }

        static int min(int[] arr){
        int res = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(res > arr[i]){
                    res = arr[i];
                }
                }
            return res;
            }
        
}

