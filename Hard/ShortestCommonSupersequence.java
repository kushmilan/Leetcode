class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        
        int dp[][] = new int[n + 1][m + 1];
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        String ans = "";
        while(n != 0 && m != 0){
            if(str1.charAt(n - 1) == str2.charAt(m - 1)){
                ans = str1.charAt(n - 1) + ans;
                n--; m--;
            }else if(dp[n - 1][m] > dp[n][m - 1]){
                ans = str1.charAt(n - 1) + ans;
                n--;
            }else{
                ans = str2.charAt(m - 1) + ans;
                m--;
            }
        }
        
        while(n > 0){
            ans = str1.charAt(n - 1) + ans;
            n--;
        }
        
        while(m > 0){
            ans = str2.charAt(m - 1) + ans;
            m--;
        }
        
        return ans;
        //return print(str1, str2, n, m, "", dp);
    }
    
    private static String print(String s1, String s2, int n, int m, String ans, int dp[][]){
        if(n ==0 || m == 0) return ans;
        
        if(s1.charAt(n - 1) == s2.charAt(m - 1)){
            return print(s1, s2, n - 1, m - 1, s1.charAt(n - 1) + ans, dp);
        }else if(dp[n - 1][m] > dp[n][m - 1]){
            return print(s1, s2, n - 1, m, s1.charAt(n - 1) + ans, dp);
        }else{
            return print(s1, s2, n, m - 1, s1.charAt(m - 1) + ans, dp);
        }
    }
}

//https://leetcode.com/problems/shortest-common-supersequence/