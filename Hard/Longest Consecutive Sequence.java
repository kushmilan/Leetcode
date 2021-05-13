class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int i = 0, n = nums.length, count = 0;
        
        while(i < n){
            int curr = 1;
            while((i < n - 1) && (nums[i] + 1 == nums[i + 1] || nums[i] == nums[i + 1])){
                if(nums[i] != nums[i + 1])curr++;
                i++;
            }
            i++;
            count = Math.max(count, curr);
        }
        
        return count;
    }
}


//---------------------------0(n)----------------------------------



class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for(int i : nums){
            set.add(i);
        }
        
        for(int i : nums){
            if(!set.contains(i - 1)){
                int temp = i, curr = 1;
                while(set.contains(temp + 1)){
                    curr++;
                    temp++;
                }
                count = Math.max(curr, count);
            }
        }
        
        return count;
    }
}