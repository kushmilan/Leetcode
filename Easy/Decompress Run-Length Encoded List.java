class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0; i < nums.length; i += 2){
            size += nums[i];
        }
        int ar[] = new int[size];
        int j = 0, k = 0;
        while(j < size){
            for(int i = 0; i < nums[k]; i++){
                ar[j++] = nums[k+1];
            }
            k += 2;
        }
        return ar;
    }
}