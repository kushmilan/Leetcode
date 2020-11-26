class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        if(s.length() == 1) return s;
        if(s.length() == 2 && s.charAt(0) == s.charAt(1)) return s;
        
        int n = s.length(), max = 0;
        String sub = s.charAt(0)+"";
        boolean dp[][] = new boolean[n][n];
        
        //For length 1
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
        }
        
        //For length 2
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                max = 2;
                sub = s.substring(i, i + 2);
                dp[i][i + 1] = true;            
            } 
        }
        
        //For length 3 and more
        for(int i = 3; i <= n; i++){
            for(int j = 0; j < n - i + 1; j++){
                int k = i + j - 1;
                
                if(s.charAt(j) == s.charAt(k) && dp[j + 1][k - 1]){
                    //System.out.println(s.substring(j, k + 1));
                    if(i > max){
                        sub = s.substring(j, k + 1);
                        max = i;                        
                    }
                    //System.out.println(max);
                    dp[j][k] = true;
                }
            }
        }        
        return sub;
    }
}

//https://leetcode.com/problems/longest-palindromic-substring/