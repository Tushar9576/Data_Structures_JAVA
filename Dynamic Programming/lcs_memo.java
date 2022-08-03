
// Longest Common subsequence using memoization

import java.util.Arrays;

public class lcs_memo {
   static int [][] memo;
    static int lcs(String s1, String s2, int m, int n){
        if(memo[m][n] != -1){
            return memo[m][n];
        }
        if(m == 0 || n == 0){
            return 0;
        }
        else{
            if(s1.charAt(m - 1) == s2.charAt(n - 1)){
                memo[m][n] = 1 + lcs(s1,s2,m - 1,n - 1);
            }
            else {
                memo[m][n] = Math.max(lcs(s1,s2,m - 1,n), lcs(s1,s2,m, n - 1));

            }
        }
        return memo[m][n];

    }

    public static void main(String[] args) {
        String s1="AXYZ", s2="BAZ";

        int m = 4, n = 3;

        memo= new int[m+1][n+1];

        for(int[] i: memo)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(lcs(s1,s2,m,n));
    }
}
