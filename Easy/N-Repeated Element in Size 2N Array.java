class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            if(set.contains(A[i])){
                return A[i];
            }else{
                set.add(A[i]);
            }
        }
        return A[0];
    }
}


------------------------------------------------------------------------------------------------

class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : A) if(!set.add(i)) return i;
        throw null;
    }
}