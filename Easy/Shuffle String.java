class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < indices.length; i++){
            map.put(indices[i], s.charAt(i));            
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < indices.length; i++){
            sb.append(map.get(i));
        }
        return sb.toString();
    }
}

--------------------------------------------------------------------------------------------------------------------------

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] sc = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            sc[indices[i]] = s.charAt(i);
        }
        return new String(sc);
    }
}
