class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int a1=-1;
        int  res[]=new int[2];
        while(left<=right){
          int  mid=(left+right)/2;
            if(nums[mid]==target){
                a1=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        res[0]=a1;
        left=0;
        right=nums.length-1;
        a1=-1;
        while(left<=right){
          int  mid=(left+right)/2;
            if(nums[mid]==target){
                a1=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
       res[1]=a1;
        return res;
        
    }
}