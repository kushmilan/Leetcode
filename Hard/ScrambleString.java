class Solution {
    static Map<String, Boolean> map = new HashMap<>();
    
    public boolean isScramble(String A, String B) {
        if(A.length() != B.length()) return false;
        
        if(A.length() == 0 &&  B.length() == 0) return true;
        
        int n = A.length();
        
        map.clear();
        
        return solve(A, B);
    }
    
    private static boolean solve(String A, String B){
        String s = A + " " + B;
        
        if(map.containsKey(s)) return map.get(s);
        
        if(A.equals(B)){
          map.put(s, true);
          return true;  
        } 
        
        if(A.length() <= 1 || B.length() <= 1){
            map.put(s, false);
            return false;
        } 
        
        int n = A.length();
        
        for(int i = 1; i < n; i++){
            //Case 1
            boolean c1 = solve(A.substring(0, i), B.substring(n - i, n)) &&
                         solve(A.substring(i, n), B.substring(0, n - i));
            
            //Case 2
            boolean c2 = solve(A.substring(0, i), B.substring(0, i)) &&
                         solve(A.substring(i, n), B.substring(i, n));
                         
            if(c1 || c2){
                map.put(s, true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
}



//https://leetcode.com/problems/scramble-string/