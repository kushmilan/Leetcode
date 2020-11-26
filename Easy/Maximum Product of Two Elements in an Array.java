class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        return (nums[l - 1] - 1) * (nums[l - 2] - 1);
    }
}

----------------------------------------------------------------------------------------------------------------
//1 ms, faster than 72.22%
//38.6 MB, less than 99.20% 

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max1){
                max1 = nums[i];
                index = i;
            }
        }
        nums[index] = 0;
        int max2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}

----------------------------------------------------------------------------------------------------------------
//1 ms, faster than 72.22% 
//39.1 MB, less than 77.33%

class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int product = 0;
        for(int i = 0; i < nums.length - 1; i++){
            max = max < nums[i] ? nums[i] : max;
            product = ((max - 1) * (nums[i + 1] -1)) > product ? ((max - 1) * (nums[i + 1] -1)) : product;
        }
        return product;
    }
}