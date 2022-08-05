public class min_jump {
    static int minjump(int[] arr, int n){
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n ; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(j + arr[j] >= i){
                    if (dp[j] != Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }

            }
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] arr = {4,1,5,3,1,3,2,1,8};
        int n = 9;
        System.out.print(minjump(arr,n));

    }
}
