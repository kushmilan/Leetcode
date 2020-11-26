class Solution {
    public int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int p = 1;
        for(int i = 0; i < s.length(); i++){
            p = p * Integer.parseInt(Character.toString(s.charAt(i)));
        }
        int su = 0;
        for(int i = 0; i < s.length(); i++){
            su = su + Integer.parseInt(Character.toString(s.charAt(i)));
        }
        return p - su;
    }
}