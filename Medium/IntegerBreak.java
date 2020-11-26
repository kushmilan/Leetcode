class Solution {
    public int integerBreak(int n) {
        if(n < 4) return n - 1;
        int ar[] = new int[n];
        for(int i = 0; i < n; i++) ar[i] = i + 1;
        int dp[] = new int[n + 1];
        return unbound(n, dp, ar, n, 2);       
    }
    
    public static int unbound(int n, int dp[], int ar[], int i, int c){
        if(c == 0 && n == 0 || i == 0) return 1;
        
        if(dp[n] != 0) return dp[n];
        if(c < 0) return Integer.MIN_VALUE;
        
        if(ar[i - 1] <= n){
            return dp[n] = Math.max(ar[i-1] * unbound(n - ar[i-1], dp, ar, i, c), Math.max(ar[i-1] * unbound(n - ar[i-1], dp, ar, i-1, c-1), unbound(n, dp, ar, i-1, c)));
        }else{
            return dp[n] = unbound(n, dp, ar, i - 1, c);
        }              
    }
}