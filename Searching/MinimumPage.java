package com.company;

import java.util.Scanner;

public class MinimumPage {
    static int minPages(int[] arr,int k)
    {
        int n = arr.length;
        int sum = 0,mx = 0;
        for (int i=0;i<n;i++)
        {
            sum = sum + arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int low = mx,high = sum,res = 0;

        while (low<=high)
        {
            int mid = (low+high)/2;
            if (isFeasible(arr,k,mid))
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
    static boolean isFeasible(int[] arr,int k,int ans)
    {
        int n = arr.length;
        int req = 1,sum = 0;
        for (int i=0;i<n;i++)
        {
            if (sum+arr[i]>ans)
            {
                req++;
                sum=arr[i];
            }
            else
            {
                sum = sum + arr[i];
            }

        }
        return (req<k);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of students who will read books: ");
        int a = sc.nextInt();
        System.out.println("Maximum number of pages a student will read is: "+minPages(arr,a));
    }
}