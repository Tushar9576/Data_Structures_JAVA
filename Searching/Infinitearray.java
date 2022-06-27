package com.company;
public class Infinitearray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 9, 10, 90, 100, 130, 140,160, 170, 200, 250};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1;
             end = end + 2*(end - start +1);
             start = temp;
        }
            return binarysearch(arr, target, start, end);
    }
    static int binarysearch (int[] arr, int target, int start, int end){
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
