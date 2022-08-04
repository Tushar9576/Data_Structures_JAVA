/*
In this problem you are given a rod of length 'n' and you have to cut it into pieces of length 'a'
'b' and 'c' such that the number of pieces is maximum.
 */
public class maxcuts {
    static int maxcuts(int n, int a, int b, int c){
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] =  -1;
            if(i - a >= 0)
                dp[i] = Math.max(dp[i], dp[i - a]);
            if(i - b >= 0)
                dp[i] = Math.max(dp[i], dp[i - b]);
            if(i - c >= 0)
                dp[i] = Math.max(dp[i], dp[i - c]);
            if(dp[i] != -1)
                dp[i]++;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.print(maxcuts(5,1,2,3));

    }
}
