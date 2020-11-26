class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int move = 0;
        for( int i = 0; i < points.length - 1; i++){
            while(points[i][0] != points[i + 1][0] || points[i][1] != points[i + 1][1]){
                //System.out.println(points[i][0] +" "+ points[i][1]);
                if(points[i][0] < points[i + 1][0] && points[i][1] < points[i + 1][1]){
                    points[i][0]++; points[i][1]++;
                }else if(points[i][0] > points[i + 1][0] && points[i][1] > points[i + 1][1]){
                    points[i][0]--; points[i][1]--;
                }else if(points[i][0] == points[i + 1][0] && points[i][1] > points[i + 1][1]){
                    points[i][1]--;
                }else if(points[i][0] > points[i + 1][0] && points[i][1] == points[i + 1][1]){
                    points[i][0]--; 
                }else if(points[i][0] < points[i + 1][0] && points[i][1] == points[i + 1][1]){
                    points[i][0]++;
                }else if(points[i][0] == points[i + 1][0] && points[i][1] < points[i + 1][1]){
                    points[i][1]++;
                }else if(points[i][0] < points[i + 1][0] && points[i][1] > points[i + 1][1]){
                    points[i][0]++;points[i][1]--;
                }else if(points[i][0] > points[i + 1][0] && points[i][1] < points[i + 1][1]){
                    points[i][0]--;points[i][1]++;
                }
                move++;
            }
        }
        return move;
    }
}

------------------------------------------------------------------------------------------------------------------------------


class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int move = 0;
        int x = 0;
        int y = 0;
        for( int i = 0; i < points.length - 1; i++){
            x = Math.abs(points[i][0] - points[i+1][0]);
            y = Math.abs(points[i][1] - points[i+1][1]);
            if(x==0 || x < y){
                move += y;
            }else{
                move += x;
            }
        }        
        return move;
    }
}