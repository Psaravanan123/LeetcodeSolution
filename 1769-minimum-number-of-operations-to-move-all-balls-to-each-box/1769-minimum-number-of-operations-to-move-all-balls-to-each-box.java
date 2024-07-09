class Solution {
    public int[] minOperations(String str) {
        int sum=0;
       int arr[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            
            for(int j=0;j<str.length();j++){
              
                
                
                   if(str.charAt(j)=='1') {
                    if(i<j){
                     sum+=j-i;
                    }else{
                        sum+=i-j;
                    }
                   
                }
                
            }
           arr[i]=sum;
            sum=0;
        }
        
       
       return arr;
    }
}