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

//------------------------------------------------------(n ^ 3)-------------------------------------------------------------

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < n - 3; i++){            
            for(int j = i + 1; j < n - 2; j++){
                List<Integer> s = new ArrayList<>();
                int curr = nums[i] + nums[j];                
                List<List<Integer>> ss = check(nums, j+1, n - 1, target - curr);
                for(List<Integer> sss : ss){
                    sss.add(nums[i]);
                    sss.add(nums[j]);
                    Collections.sort(sss);                    
                    set.add(sss);
                }
            }
        }
        
        List<List<Integer>> list = new ArrayList<>();
        for(List<Integer> l : set){
            list.add(l);
        }
        
        return list;
    }
    
    private static List<List<Integer>> check(int nums[], int i, int j, int t){
        List<List<Integer>> s = new ArrayList<>();
        while(i < j){
            if(nums[i] + nums[j] == t){
                List<Integer> ss = new ArrayList<>();
                ss.add(nums[i]);
                ss.add(nums[j]);
                s.add(ss);
                i++;
            }else if(nums[i] + nums[j] < t){
                i++;
            }else if(nums[i] + nums[j] > t){
                j--;
            }
        }
        return s;
    }
    
}