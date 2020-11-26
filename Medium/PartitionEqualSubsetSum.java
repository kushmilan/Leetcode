class Solution {
    static boolean[][] dp = new boolean[1][1];
    public boolean canPartition(int[] nums){
        /*
        int sum = 0;
        for(int e : nums) sum += e;
        if(sum % 2 == 1) return false;
        dp = new boolean[nums.length + 1][sum/2 + 1];
        return che(nums, nums.length, sum/2);
        */
        return c(nums);
    }
    
    public static boolean c(int nums[]){
        int total = 0;
        for(int i : nums) total += i;
        if(total % 2 == 1) return false;
        total /= 2;
        boolean dp[] = new boolean[total + 1];
        dp[0] = true;
        for(int e : nums){
            for(int i = total; i >= e; i--){
                dp[i] |= dp[i - e];
            }
        }
        return dp[total];
    }
    
    public static boolean che(int nums[], int n, int val){
        for(int i = 0; i <=n; i++){
            for(int j = 0; j <=val; j++){
                if(i == 0 || j != 0) dp[i][j] = false;
                else if(j == 0) dp[i][j] = true;
            }
        }
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=val; j++){
                if(nums[i - 1] <= j){
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][val];
    }
    
    public static boolean check(int nums[], int n, int val, int curr){
        if(curr == val) return true;
        
        if(n == 0 || curr > val) return false;
        
        if(dp[n][curr]) return dp[n][curr];
        
        if(nums[n - 1] <= val){
            return dp[n][curr] = check(nums, n - 1, val, curr + nums[n - 1]) || check(nums, n - 1, val, curr);
        }else{
            return dp[n][curr] = check(nums, n - 1, val, curr);
        }
    }
}