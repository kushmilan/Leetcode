class Solution {
    //static Map<String, Boolean> check = new HashMap<>();   
    static boolean check[][] = new boolean[1][1];
    public int minCut(String s) {
        int n = s.length();
        if(s.length() == 2) {
            if(s.charAt(0) != s.charAt(1)) return 1;
            else return 0;
        }
        longestPalindrome(s);
        int dp[][] = new int[n][n];
        for(int a[] : dp)  Arrays.fill(a, -1);
        return minPartitioning(s, 0, n - 1, dp);
    }
    
    private static int minPartitioning(String s, int i, int j, int dp[][]){
        if(i > j) return 0;
        
        if(check[i][j]) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int ans = Integer.MAX_VALUE;
        
        for(int k = i; k < j; k++){
            int left = (dp[i][k] != -1) ? dp[i][k] : minPartitioning(s, i, k, dp);
            int right = (dp[k + 1][j] != -1) ? dp[k + 1][j] : minPartitioning(s, k + 1, j, dp);
            int part = left + right + 1;
            ans = Math.min(ans, part);
            dp[i][j] = ans;
        }
        
        return ans;
    }
    /*
    private static boolean isPalindrome(String s, int i, int j){
        String k = i +" "+j;
        if(check.containsKey(k)) return check.get(k);
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                check.put(k, true);
                return false;
            } 
            i++; j--;
        }
        check.put(k, true);
        return true;
    }
    */
    
    public void longestPalindrome(String s) {
        int n = s.length();
        check = new boolean[n][n];
        
        //For length 1
        for(int i = 0; i < n; i++){
            check[i][i] = true;
        }
        
        //For length 2
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                check[i][i + 1] = true;            
            } 
        }
        
        //For length 3 and more
        for(int i = 3; i <= n; i++){
            for(int j = 0; j < n - i + 1; j++){
                int k = i + j - 1;                
                if(s.charAt(j) == s.charAt(k) && check[j + 1][k - 1]){
                    check[j][k] = true;
                }
            }
        }        
    }
}

//https://leetcode.com/problems/palindrome-partitioning-ii/