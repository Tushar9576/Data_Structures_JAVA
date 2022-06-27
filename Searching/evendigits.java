package com.company;

public class evendigits {
    public static void main(String[] args) {
        int [] nums = {32, 345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
    return count;
    }

    static boolean even(int num) {
        int noofdigits = digits(num);
        if (noofdigits%2 == 0){
            return true;
        }
     return false;
    }
    static int digits(int num){
        if (num==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10 ;
        }
        return count;
    }
}
