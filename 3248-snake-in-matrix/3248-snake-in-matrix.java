class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int arr[][]=new int[n][n];
        int v=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=v++;
            }
        }
        int res[]=new int[commands.size()];
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("RIGHT")){
                res[i]=0;
            }else if(commands.get(i).equals("LEFT")){
                res[i]=1;
            }else if(commands.get(i).equals("UP")){
                res[i]=2;
            }else{
                res[i]=3;
            }
        }
        int row[]={0,0,-1,1};
        int col[]={1,-1,0,0};
        int k=0;
        int m=0;
        int sum=0;
        for(int i=0;i<res.length;i++){
           k=k+row[res[i]];
           m=m+col[res[i]];
            
        }
        return arr[k][m];

        
    }
}