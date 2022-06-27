package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
      //  int [] arr = {-9,-12,-18,0,2,3,4,15,16,22,32};
        int[] arr = {98,80,74,66,54,32,22,19,9,0,-9};
        int ans = orderAgnosticBS(arr, 9 );
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
   // find whether the array is sorted in ascending or descending
        boolean isasc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return  mid;
            }
            if (isasc){
                if (target < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
