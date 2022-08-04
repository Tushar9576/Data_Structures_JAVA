public class min_coins {
    static int getmin(int[] arr, int n, int val){
        int[] dp = new int[val + 1];
        dp[0] = 0;
        for (int i = 1; i <= val ; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= val ; i++) {
            for (int j = 0; j < n ; j++) {
                if(arr[j] <= i){
                    int sub_res = dp[i - arr[j]];
                    if(sub_res != Integer.MAX_VALUE)
                        dp[i] = Math.min(dp[i], sub_res + 1);

                }
            }
        }
        return dp[val];
    }
    public static void main(String[] args) {
        int[] coins = {3,4,1};
        int val = 5, n = 3;
        System.out.print(getmin(coins,n,val));
    }
}
