import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        
        int n = nums.length;
        
        for(int i = 0; i < n - 3; i++){            
            for(int j = i + 1; j < n - 2; j++){
                for(int k = j + 1; k < n - 1; k++){
                    for(int l = k + 1; l < n; l++){
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                            List<Integer> s = new ArrayList<>();
                            s.add(nums[i]);
                            s.add(nums[j]);
                            s.add(nums[k]);
                            s.add(nums[l]);
                            Collections.sort(s);
                            set.add(s);
                        }                        
                    }
                }
            }
        }
        
        List<List<Integer>> list = new ArrayList<>();
        for(List<Integer> l : set){
            list.add(l);
        }
        
        return list;
    }
}