class Solution {
    public int[] decompressRLElist(int[] num) {
      ArrayList<Integer> list=new ArrayList<>();
      
       for(int i=0;i<num.length-1;i+=2){
           for(int k=0;k<num[i];k++){
            list.add(num[i+1]);
           }
       }
       int arr[]=new int[list.size()];
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }
       return arr; 
    }
}