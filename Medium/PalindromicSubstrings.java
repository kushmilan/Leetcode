class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), count = 0;
        boolean dp[][] = new boolean[n][n];
        
        //For length 1
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
            count++;
        }
        
        //For length 2
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
                dp[i][i + 1] = true;            
            } 
        }
        
        //For length 3 and more
        for(int i = 3; i <= n; i++){
            for(int j = 0; j < n - i + 1; j++){
                int k = i + j - 1;
                
                if(s.charAt(j) == s.charAt(k) && dp[j + 1][k - 1]){
                    count++;
                    dp[j][k] = true;
                }
            }
        }        
        return count;
    }
}


//https://leetcode.com/problems/palindromic-substrings/