class Solution {
    public int minOperations(String[] str) {
        int n=str.length;
      
        int count=0;
        for(int i=0;i<n;i++){
             if(count<0){
                count=0;

             }
             if(str[i].equals("./"))
             {
               
             }
             else if(str[i].equals("../"))
             {
               
                count--;
                 System.out.print(str[i]+" ");
                System.out.print("count--:"+count+" ");
             }
             else{
               
                count++;
                 System.out.print(str[i]+" ");
                  System.out.print("count++:"+count+" ");
             }
        }
if(count<0){
        return 0;
}else{
    return count;
}

    }
}