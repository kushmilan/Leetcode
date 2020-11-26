class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> s = new HashSet<>();
        for(int i = 0; i < J.length(); i++){
            s.add(J.charAt(i));
        }
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(s.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }
}