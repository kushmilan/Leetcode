class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int s = arr.length;
        for(int i = 0; i < s; i++){
            for(int j = i + 1; j < s; j++){
                for(int k = j + 1; k < s; k++){
                    if(Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        count++;
                    }
                }
            }   
        }
        return count;
    }
}

------------------------------------------------------------------------------------------------------------------------


class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int s = arr.length;
        for(int i = 0; i < s; i++){
            for(int j = i + 1; j < s; j++){
                if(Math.abs(arr[i] - arr[j]) <= a){
                    for(int k = j + 1; k < s; k++){
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                            count++;
                        }
                    }
                }                                
            }   
        }
        return count;
    }
}