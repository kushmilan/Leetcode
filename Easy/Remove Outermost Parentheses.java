class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        String r = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else if(s.charAt(i) == ')'){
                stack.pop();
            }
            if(stack.isEmpty()){
                r += s.substring((start+1), i);
                start = i + 1;
            }
        }
        return r;
    }
}

-----------------------------------------------------------------------------------------------------------------------------

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0, count = 0;
        String r = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count ++;
            }else if(s.charAt(i) == ')'){
                count --;
            }
            if(count == 0){
                r += s.substring((start+1), i);
                start = i + 1;
            }
        }
        return r;
    }
}


---------------------------------------------------------------------------------------------------------------------------------



