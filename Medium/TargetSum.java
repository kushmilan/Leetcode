class Solution {
    static Map<String, Integer> map = new HashMap<>();
    public int findTargetSumWays(int[] nums, int S) {
        map.clear();
        int sum = 0;
        for(int e : nums) sum += e;
        if(S > sum || (S + sum) % 2 == 1) return 0;
        sum = (sum + S) / 2;
        return check(nums, sum, nums.length);
    }
    
    public static int check(int[] nums, int curr, int n){
        if(curr == 0 && n == 0) return 1;        
        if(n == 0) return 0;
        
        String s = n + " " + curr;
        
        if(map.containsKey(s)) return map.get(s);
        
        int count = check(nums, curr - nums[n - 1], n - 1) + check(nums, curr, n - 1);
        
        map.put(s, count);
        
        return count;
    }
}