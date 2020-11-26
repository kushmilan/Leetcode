class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < words.length;i++){
            String s = "";
            for(int j = 0; j < words[i].length(); j++){            
                s += morse[(int)words[i].charAt(j) - 97];                
            }
            if(!set.contains(s)){
                count++;
                set.add(s);
            }
        }
        return set.size();
    }
}



-------------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < words.length;i++){
            StringBuilder s = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++){            
                s.append(morse[(int)words[i].charAt(j) - 'a']);                
            }            
            set.add(s.toString());
        }
        return set.size();
    }
}