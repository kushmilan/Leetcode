class Solution {
    public boolean judgeCircle(String moves) {
        int U = 0, D = 0, L = 0, R = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U') U++;
            if(moves.charAt(i) == 'D') D++;
            if(moves.charAt(i) == 'R') R++;
            if(moves.charAt(i) == 'L') L++;
        }
        if(U == D && L == R) return true;
        else return false;
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public boolean judgeCircle(String moves) {
        int U = 0, D = 0, L = 0, R = 0;
        for(char i : moves.toCharArray()){
            if(i == 'U') U++;
            if(i == 'D') D++;
            if(i == 'R') R++;
            if(i == 'L') L++;
        }
        if(U == D && L == R) return true;
        else return false;
    }
}