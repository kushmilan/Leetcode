class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ar[] = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            ar[i] = count;
            count = 0;
        }
        return ar;
    }
}

------------------------------------------------------------------------------------------------------------------

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ar[] = nums.clone();
        Arrays.sort(ar);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(ar[i]) == null){
                map.put(ar[i], i);   
            }            
        }
        
        for(int i = 0; i < nums.length; i++){
            ar[i] = map.get(nums[i]);
        }
        return ar;
    }
}