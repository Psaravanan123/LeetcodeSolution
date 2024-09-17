class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        List<Integer> list=new ArrayList<>();
        int ref=0;
        if(mat[0].length==1){
           for(int i=0;i<mat[0].length;i++){
            int max=0;
            for(int j=0;j<mat.length;j++){ 
                if(mat[j][i]>max){
                    max=mat[j][i];
                }
            }
            list.add(max);
           }
        }else if(mat.length==1){
               for(int i=0;i<mat.length;i++){
            int min=Integer.MAX_VALUE ;
            for(int j=0;j<mat[0].length;j++){ 
                  if(mat[i][j]<min){
                    min=mat[i][j];
                  }  

            }
            list.add(min);
        }
        }
        else{
        for(int i=0;i<mat.length;i++){
            int min=Integer.MAX_VALUE ;
            int index=0;
            for(int j=0;j<mat[0].length;j++){ 
                  if(mat[i][j]<min){
                    min=mat[i][j];
                    index=j;
                  }    
            }
            int max=0;
            for(int k=0;k<mat.length;k++){
               if(mat[k][index]>max){
                max=mat[k][index];
               }
            }
            if(max==min){
                list.add(max);
            }
             
        }
        }
        return list;

    }
}