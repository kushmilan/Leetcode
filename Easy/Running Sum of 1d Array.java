class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length==1){
            return nums;
        }else{
            for(int i = 1; i<nums.length;i++){
                nums[i] = nums[i] + nums[i-1];
            }   
            return nums;
        }
        
    }
}