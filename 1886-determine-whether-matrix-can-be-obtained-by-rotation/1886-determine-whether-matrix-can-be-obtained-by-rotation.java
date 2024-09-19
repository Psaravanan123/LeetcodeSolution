class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int mone=0;
        int mzero=0;
        int tone=0;
        int tzero=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==1){
                  mone++;  
                }else{
                   mzero++;
                }
                if(target[i][j]==1){
                     tone++;
                }else{
                     tzero++;
                }
            }
        }
        if(mone==tone&&mzero==tzero){
            return true;
        }else{
            return false;
        }
    }
}