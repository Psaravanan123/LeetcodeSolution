class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row=matrix.length-1;
        int col=matrix[0].length-1;
        int i=-1;
        int j=0;
        for(int k=0;k<row;k++){
            i++;
            j=0;
        while(i<row&&j<col){
            
            if(matrix[i][j]!=matrix[i+1][j+1]){
                return false;
            }
          j++;
        }
        }
        return true;
    
    }
}