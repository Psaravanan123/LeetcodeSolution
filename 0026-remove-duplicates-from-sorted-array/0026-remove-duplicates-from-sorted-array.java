class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=-1000){
            nums[count++]=nums[i];
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                nums[j]=-1000;
            }
        }
        }
      }
      return count;
    }
}