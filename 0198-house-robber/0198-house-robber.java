class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return help(nums,n,dp);
        
    }
   public int help(int arr[],int n,int dp[]){

    if(n<=0){
        return 0;
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    int pick=arr[n-1]+help(arr,n-2,dp);
    int notpick=help(arr,n-1,dp);
    return dp[n]=Math.max(pick,notpick);
   }
}