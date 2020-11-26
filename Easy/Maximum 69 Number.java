class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '6'){
                sb.setCharAt(i, '9');
                return Integer.parseInt(sb.toString());
            }
        }
        return Integer.parseInt(sb.toString());
    }
}

------------------------------------------------------------------------------------------------------------------------


class Solution {
    public int maximum69Number (int num) {
        //Reverse Number
        int rev = 0;
        while(num > 0){
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        
        //reverse and change first 6 to 9
        boolean flag = true; //for insuring that we have changed the first 6 or not
        while(rev > 0){
            num *= 10;
            int add = rev % 10;
            if(flag && add == 6){
                flag = false;
                add = 9;
            }
            num += add;
            rev /= 10;
        }
        
        return num;
    }
}