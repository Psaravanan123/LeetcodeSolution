class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
    
        int k=mat.length-1;
        for(int i=0;i<mat.length;i++){
            if(mat.length%2!=0){
            if(i!=mat.length/2){
 sum+=mat[i][i];
         }
            }else{
                 sum+=mat[i][i];
            }
        
         
            sum+=mat[i][k];
            k--;
        }
      return sum;
    }
}