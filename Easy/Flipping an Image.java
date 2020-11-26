class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int  i = 0; i < A.length; i++){
            A[i] = reverse(A[i]);
            A[i] = invert(A[i]);
        }
        return A;
    }
    
    public int[] invert(int A[]){
        for(int i = 0; i < A.length; i++){
            if(A[i]==0){
                A[i] = 1;
            }else{
                A[i] = 0;
            }
        }
        return A;
    }
    
    static int[] reverse(int a[]){ 
        int i, k, t; 
        for (i = 0; i < a.length / 2; i++) { 
            t = a[i]; 
            a[i] = a[a.length - i - 1]; 
            a[a.length - i - 1] = t; 
        } 
        return a;
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int  i = 0; i < A.length; i++){
            A[i] = reverse(A[i]);
        }
        return A;
    }
    
    static int[] reverse(int a[]){ 
        int i, k, t; 
        for (i = 0; i < a.length / 2; i++) { 
            t = a[i]; 
            a[i] = a[a.length - i - 1] ^ 1; 
            a[a.length - i - 1] = t ^ 1; 
        } 
        if(a.length % 2 != 0) a[a.length/2] ^= 1;
        return a;
    }
}