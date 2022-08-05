
// This is a recursive solution of 0-1 Knapsack Problem
// T.C : O(2^n)

public class zero_one_knapsack {
    static int knapsack(int w, int[] wt, int[] val, int n){
        if(n == 0 || w == 0)
            return 0;
        if(wt[n - 1] > w){
            return knapsack(w,wt,val,n - 1);
        }
        else {
            return Math.max(knapsack(w,wt,val,n - 1), val[n - 1] + knapsack(w-wt[n-1], wt, val, n - 1));
        }
    }
    public static void main(String[] args) {
        int w = 10, wt[] = {5,4,6,3}, val[] = {10,40,30,50}, n = 4;
        System.out.print(knapsack(w,wt,val,n));
    }
}
