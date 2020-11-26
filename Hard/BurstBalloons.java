class Solution {
    public int maxCoins(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int e : nums) list.add(e);
        list.add(1);
        int n = list.size();
        int dp[][] = new int[n][n];
        return solve(list, 1, n - 1, dp);
    }
    
    private int solve(List<Integer> list, int i, int j, int dp[][]){
        if(i >= j) return 0;
        
        int max = Integer.MIN_VALUE;
        
        if(dp[i][j] != 0) return dp[i][j];
        
        for(int k = i; k < j; k++){
            int temp = solve(list, i, k, dp) + solve(list, k + 1, j, dp);
            temp += list.get(i - 1) * list.get(k) * list.get(j);
            
            max = Math.max(max, temp);
            
            dp[i][j] = max;
        }
        
        return max;
    }
}

//https://leetcode.com/problems/burst-balloons/