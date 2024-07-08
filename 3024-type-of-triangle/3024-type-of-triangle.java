class Solution {
    public String triangleType(int[] num) {
        int count=0;
        for(int i=0;i<num.length;i++){
          for(int j=0;j<num.length;j++){
            if(num[i]==num[j]){
                count++;
            }
          }
          if(num[0]+num[1]>num[2]&&num[1]+num[2]>num[0]&&num[0]+num[2]>num[1]){
        
          if(count==num.length){
        return "equilateral";
       }  else if(count==2){
        return "isosceles";
       }
       }
       count=0;
        }
       
     if(num[0]+num[1]>num[2]&&num[1]+num[2]>num[0]&&num[0]+num[2]>num[1]){
        return "scalene";
     }else{
        return "none";
     }
       
    }
}