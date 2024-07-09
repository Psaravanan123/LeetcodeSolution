class Solution {
    public int[] twoSum(int[] num, int target) {
    HashMap<Integer,Integer> hash=new HashMap<>();
    for(int i=0 ;i<num.length;i++){
        hash.put(i,num[i]);
    }
    int arr2[] =new int[2];
      for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
            if(hash.get(i)+hash.get(j)==target){
              arr2[0]=i;
              arr2[1]=j;
              break;
            }
        }
      }
      return arr2;
    }
}   
    
