import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int inversePoint = 0;
        boolean flag = true;
        
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                flag = false;
                inversePoint = i;
                break;
            }
        }
        
        if(flag){
            Arrays.sort(nums);
            return;
        }
        
        int num = nums[inversePoint];
        for(int i = nums.length - 1; i > inversePoint; i--){
            if(num < nums[i]){
                nums[inversePoint] ^= nums[i];
                nums[i] ^= nums[inversePoint];
                nums[inversePoint] ^= nums[i];
                break;
            }
        }
        int i = inversePoint + 1, j = nums.length - 1;
        while(i < j){
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
            i++; j--;
        }
    }
}