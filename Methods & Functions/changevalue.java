package com.company;

import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {

        int[] arr = {1,2,3,7,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] num) {
        for (int i = 0; i < 5; i++) {
            num[i] *= 2;

        }
    }
}
