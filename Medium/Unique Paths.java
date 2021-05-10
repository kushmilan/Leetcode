class Solution {
    static int dp[][] = new int[1][1];
    
    public int uniquePaths(int m, int n) {
        int start[] = {0,0};
        int end[] = {m - 1, n - 1};
        
        dp = new int[m + 1][n + 1];
        
        return countWays(start, end, m, n);
    }
    
    private static int countWays(int curr[], int end[], int m, int n){
        int i = curr[0];
        int j = curr[1];
        
        if(dp[i][j] != 0) return dp[i][j];
        
        if(i == m - 1 && j == n - 1) return 1;
        
        if(i >= m || j >= n) return 0;
        
        return dp[i][j] = countWays(new int[]{i + 1, j}, end, m, n) + countWays(new int[]{i, j + 1}, end, m, n);
        
    }
    
}