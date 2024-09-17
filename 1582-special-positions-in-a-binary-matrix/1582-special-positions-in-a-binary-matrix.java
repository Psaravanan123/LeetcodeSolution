class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(check(mat,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean check(int[][] arr,int row,int col){
        for(int i=0;i<arr.length;i++ ){
            if(i!=row){
            if(arr[i][col]!=0){
                return false;
            }
            }
        }
        for(int i=0;i<arr[0].length;i++){
            if(i!=col){
                if(arr[row][i]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}