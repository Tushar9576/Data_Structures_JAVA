package com.company;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr  = {23,14,67,98,11,10,-34,76,-85,19};
        int target = 19;
        System.out.println(linearsearch2(arr, target,1,5));
    }
    static int linearsearch2(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }
}
