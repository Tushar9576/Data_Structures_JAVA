
// T.c : O(W*n)
/* This solution is even worse than recursive for larger values of  */
public class zero_one_knapsack_dp {
    static int knapsack(int w, int[] wt, int[] val, int n){
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= w; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if(wt[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i - 1][j - wt[i - 1]]);
            }
        }
            return dp[n][w];
    }
    public static void main(String[] args) {
        int w = 10, wt[] = {5,4,6,3}, val[] = {10,40,30,50}, n = 4;
        System.out.print(knapsack(w,wt,val,n));
    }
}
