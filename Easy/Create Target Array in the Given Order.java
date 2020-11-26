class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int ar[] = new int[nums.length];
        Arrays.fill(ar, -1);
        for(int i = 0; i < nums.length; i++){
            if(ar[index[i]]==-1){
                ar[index[i]] = nums[i];
            }else{
                for(int j = nums.length-1; j >= index[i]; j--){
                    if(j != 0){
                        ar[j] = ar[j - 1];   
                    }                    
                }
                ar[index[i]] = nums[i];
            }
        }
        return ar;
    }
}


------------------------------------------------------------------------------------------------------------


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int ar[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(index[i] < i){
                for(int j = nums.length-1; j >= index[i]; j--){
                    if(j != 0){
                        ar[j] = ar[j - 1];   
                    }                    
                }
            }
            ar[index[i]] = nums[i];
        }
        return ar;
    }
}


