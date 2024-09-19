class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices[0].length;j++){
                if(j==0){
               for(int k=0;k<n;k++){
                 arr[indices[i][j]][k]++;
               }
                }else{
                   for(int k=0;k<m;k++){
                 arr[k][indices[i][j]]++;
               }  
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
           if(arr[i][j]%2!=0){
                count++;
            }
            }
            
        }
        return count;
    }
}