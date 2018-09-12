package com.kinghood.algo;

// https://leetcode.com/problems/valid-permutations-for-di-sequence/description/
public class DISequence {

    public int numPermsDISequence(String S) {
        int mod = 1000000007;
        int[] dp = new int[S.length()+1];
        dp[0] = 1;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'D') {
                dp[i+1] = 0;
                for (int j=i; j>0; j--) {
                    dp[j-1] = (dp[j-1] + dp[j]) % mod;
                }
            } else {  // i=='I'
                int prev = dp[0];
                dp[0] = 0;
                for (int j=1; j<=i+1; j++) {
                    int cur = dp[j];
                    dp[j] = (dp[j-1] + prev) % mod;
                    prev = cur;
                }
            }
        }

        int result = 0;
        for (int v : dp) {
            result = (result + v) % mod;
        }

        return result;
    }
}
