class Solution {
    public int search(int[] num, int target) {
         HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<num.length;i++){
        map.put(num[i],i);
       }
       Arrays.sort(num);
        int left=0;
        int right=num.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(num[mid]==target){
                return map.get(num[mid]);
            }else if(num[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}