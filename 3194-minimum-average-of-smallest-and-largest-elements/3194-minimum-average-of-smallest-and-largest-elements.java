class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double arr[]=new double[n/2];
        Arrays.sort(nums);
        int len=n-1;
        for(int i=0;i<n/2;i++){
             arr[i]=(double)(nums[i]+nums[len--])/2;
        }
        double small=10000.0;
        for(int i=0;i<arr.length;i++){
              if(arr[i]<small){
                small=arr[i];
              }
        }
        return small;
    }
}