class Solution {
    public int[] plusOne(int[] arr) {
        int size=arr.length-1;
   if(arr[size]==9){
    int ref=1;
   ArrayList<Integer> list=new ArrayList<>();
    int j=0;
    for(int i=size;i>=0;i--){
     int sum=arr[i]+ref;
     ref=sum/10;
     list.add(sum%10);
    }
    if(ref!=0){
    list.add(ref);
    }
    j=list.size()-1;
    int r2[]=new int[list.size()];
    for(int i=0;i<list.size();i++){
      r2[i]=list.get(j--);
    }
    return r2;
   }
    arr[size]=arr[size]+1;
    return arr;
    }
   
   
}