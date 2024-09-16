class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int k=grid.length-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==j ){
                    if(grid[i][j]!=0){
                        continue;
                    }else{
                        return false;
                    }
                }else if(j==k){
                     if(grid[i][k]!=0 ){
                        continue;
                    }else{
                        return false;
                    }
                }else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
            k--;
        }
        return true;
    }
}