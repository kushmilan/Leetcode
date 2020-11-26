class Solution {
    public int findPairs(int[] nums, int k) {
        Set<String> set = new HashSet<>();        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] - nums[j] == k || nums[j] - nums[i] == k){
                    if(!set.contains(nums[i] +" "+ nums[j]) && !set.contains(nums[j] +" "+ nums[i])){
                        set.add(nums[i] +" "+ nums[j]);                    
                    }                    
                }
            }
        }
        return set.size();
    }        
}

---------------------------------------------------------------------

class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : map.keySet()){
            if(k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1) count++;
        }
        return count;
    }        
}