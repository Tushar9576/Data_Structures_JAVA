package Arrays.Sorting;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        mergesortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2 ;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0,k = 0;
        while(i< first.length && j< second.length){

            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the array is not complete
        // copy the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            i++;
            k++;
        }
        return mix;
    }
    static void mergesortInplace(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = (start + end) / 2 ;
         mergesortInplace(arr, start, mid);
         mergesortInplace(arr,mid,end);
         mergeInplace(arr, start, mid, end);
    }
    static void mergeInplace(int[] arr, int start, int mid ,int end){

        int[] mix = new int[end - start];
        int i = start, j = mid,k = 0;
        while(i< mid && j< end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the array is not complete
        // copy the remaining elements
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            mix[k] = arr[j];
            i++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }
}
