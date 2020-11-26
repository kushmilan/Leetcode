class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(check(i)){
                list.add(i);
            }
        }
        return list;
    }
    
    public boolean check(int num){        
        int temp = num;
        while(num != 0){
            int check = num % 10;
            if(check == 0 || temp % check != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}

------------------------------------------------------------------------------------------------------------------