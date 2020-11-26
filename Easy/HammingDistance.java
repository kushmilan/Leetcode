class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(x != 0 || y != 0){
            if(x % 2 != y % 2) count++;
            x /= 2; y /= 2;
        }
        return count;
    }
}

----------------------------------------------------------------------------

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int first = 0, second  = 0;
        for( int i = 1; i <= 32; i++){
            if((x & (1 << (i - 1))) == 0) first = 0;
            else first = 1;
            
            if((y & (1 << (i - 1))) == 0) second = 0;
            else second = 1;
            
            if((first ^ second) == 1) count++;            
        }
        return count;
    }
}