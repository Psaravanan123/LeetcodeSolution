class Solution {
    public int[][] modifiedMatrix(int[][] mat) {
        for(int i=0;i<mat[0].length;i++){
            int great=0;
            for(int k=0;k<mat.length;k++){
                if(mat[k][i]>great){
                    great=mat[k][i];
                }
            }
            for(int j=0;j<mat.length;j++){
                if(mat[j][i]==-1){
                   mat[j][i]=great;
                }
            }
        }
        return mat;
    }
}