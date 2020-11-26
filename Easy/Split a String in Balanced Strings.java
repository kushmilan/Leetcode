class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek()!= s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
            if(stack.isEmpty()){
                count++;
            }
        }
        return count;
    }
}


--------------------------------------------------------------------------------------------------------------------


class Solution {
    public int balancedStringSplit(String s) {
        if(s.length()==2){
            return 0;
        }
        int count = 0;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) == 'R' ? -1 : 1;
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
}