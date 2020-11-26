class Solution {
    public int longestPalindromeSubseq(String s) {
        String ss = "";
        int j =  s.length() - 1;
        while(j >= 0){
            ss += s.charAt(j--);
        }
        int n = s.length();
        int dp[][] = new int[n + 1][n + 1];
        for(int i = 0; i <= n; i++){
            for(j = 0; j <= n; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(s.charAt(i - 1) == ss.charAt(j - 1)){
                    dp[i][j] =  1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] =  Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][n];
    }
}

//https://leetcode.com/problems/longest-palindromic-subsequence/