class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++){
            count += negative(grid[i]);
        }
        return count;
    }
    
    public int negative(int arr[]){        
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                count++;
            }
        }
        return count;
    }
}