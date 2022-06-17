package com.company;

public class xyz {
    static void Reverse(int[] arr)
    {
        int n = arr.length;
        int low =0;
        int high = n-1;
        int temp;
        while (low<high)
        {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,8,1,34,20,15,17,32,11,9};
        Reverse(arr);
    }
}
