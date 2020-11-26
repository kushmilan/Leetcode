class Solution {
    public int[] sumZero(int n) {
        int sum = 0, i = 0;
        Random r = new Random();
        int[] ar = new int[n];
        HashSet<Integer> set = new HashSet<>();
        while(i < n-1){
            int temp = r.nextInt(1000000);
            if(!set.contains(temp)){
                set.add(temp);
                ar[i] = temp;
                sum += ar[i++];                
            }
        }        
        ar[n - 1] = -sum;
        return ar;
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int[] sumZero(int n) {
        int sum = 0, i = 0, j = 1;
        int[] ar = new int[n];
        while(i < n-1){
                ar[i] = j++;
                sum += ar[i++];        
        }        
        ar[n-1] = -sum;
        return ar;
    }
}
------------------------------------------------------------------------------------------------------------------