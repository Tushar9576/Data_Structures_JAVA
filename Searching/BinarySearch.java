package com.company;

public class BinarySearch {

    public static void main(String[] args) {
    int [] arr = {-9,-12,-18,0,2,3,4,15,16,22,32};
    int ans = binarysearch(arr, 99 );
        System.out.println(ans);
    }
    static int binarysearch (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
             if (target < arr[mid]){
                 end = mid -1;
             }else if (target > arr[mid]){
                 start = mid + 1;
             }else{
                 return mid;
             }

        }
        return -1;
    }
}
