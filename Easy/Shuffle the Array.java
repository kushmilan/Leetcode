class Solution {
    public int[] shuffle(int[] nums, int n){        
        int[] num = new int[2*n];
        int j = 0;
        for(int i = 0; i< n; i++){
            num[j] = nums[i];
            j = j+2;
        }
        j = 1;
        for(int i = n; i< 2*n; i++){
            num[j] = nums[i];
            j = j+2;
        }
        return num;
    }
}