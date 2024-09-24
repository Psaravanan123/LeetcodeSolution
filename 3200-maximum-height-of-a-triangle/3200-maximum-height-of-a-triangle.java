class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int rred=red;
        int bblue=blue;
        int count=0;
     int i=1;
       while(true){
           if(i%2!=0){
            red-=i;
              if(red<0){
                break;
              }
              count++;
           }else{
            blue-=i;
                if(blue<0){
                  break;
                }
                count++;
           }
            i++;
       }
       int count1=0;
       int j=1;
       while(true){
           if(j%2!=0){
            bblue-=j;
              if(bblue<0){
                break;
              }
              count1++;
           }else{
            rred-=j;
                if(rred<0){
                  break;
                }
                count1++;
           }
            j++;
       }
       return Math.max(count,count1);
    }
}