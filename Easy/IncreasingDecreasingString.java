class Solution {
    public String sortString(String s) {
        int count[] = new int[26];
        int len = s.length();
        for(int i = 0; i < len; i++){
            System.out.print((int)s.charAt(i) - 97+" ");
            count[(int)s.charAt(i) - 97]++;
        }        
        int length = count.length, j = 0;
        boolean flag = true;
        String result = "";
        while(j < len){
            if(flag){
                for(int i = 0; i < length; i++){
                    if(count[i] > 0){
                        result += (char)(i+97);
                        count[i]--;
                        j++;
                    }                    
                }    
                flag = false;
            }else{
                for(int i = length - 1; i >= 0; i--){
                   if(count[i] > 0){
                        result += (char)(i+97);
                        count[i]--;
                        j++;
                    }      
                }    
                flag = true;
            } 
        }
        return result;
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------


class Solution {
    public String sortString(String s) {
        int count[] = new int[26];
        int len = s.length();
        for(int i = 0; i < len; i++){
            count[(int)s.charAt(i) - 'a']++;
        }        
        int length = count.length, j = 0;
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        while(j < len){
            StringBuilder sbtemp = new StringBuilder();
            for(int i = 0; i < length; i++){
                if(count[i] > 0){
                    sbtemp.append((char)(i+97));
                    count[i]--;
                    j++;
                }                    
            }
            if(flag){
                sb.append(sbtemp);
                flag = false;
            }else{                
                sb.append(sbtemp.reverse());
                flag = true;
            } 
        }
        return sb.toString();
    }
}