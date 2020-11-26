class Solution {
    public String freqAlphabets(String s) {
        HashMap<String, String> map = new HashMap<>();
        int size  = s.length();
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] encry = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10#", "11#", "12#", "13#", "14#", "15#", "16#", "17#", "18#", "19#", "20#", "21#", "22#", "23#", "24#", "25#", "26#"};
        for(int i = 0; i < alphabets.length; i++){
            map.put(encry[i], alphabets[i]);
        }
        char[] ar = s.toCharArray();
        int i = 0;  
        String result = "";
        while(i < size){
            boolean flag = true;
            if(i + 3 <= size && flag){
                if(map.containsKey(s.substring(i, i + 3))){
                  result += map.get(s.substring(i, i + 3));
                    i += 3;
                    flag = false;
                } 
            }
            if(i + 2 <= size && flag){
                if(map.containsKey(s.substring(i, i + 2))){
                    result += map.get(s.substring(i, i + 2));
                    i += 2;
                    flag = false;
                } 
            }
            if(i + 1 <= size && flag){
                result += map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return result;
    }
}

--------------------------------------------------------------------------------------------------------------