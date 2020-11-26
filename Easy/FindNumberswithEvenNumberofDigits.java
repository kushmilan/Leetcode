class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++ ){
            if(Integer.toString(nums[i]).length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}


------------------------------------------------------------------------------------------------

class Solution{
    public int findNumbers(int[] nums){
        int count = 0;
        for(int i : nums){
            if(((int)Math.log10(i)+1) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}