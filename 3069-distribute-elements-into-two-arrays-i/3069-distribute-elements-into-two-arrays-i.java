class Solution {
    public int[] resultArray(int[] nums) {
int arr1[]=new int[nums.length];
int arr2[]=new int[nums.length];
arr1[0]=nums[0];
arr2[0]=nums[1];
int j=0;
int k=0;
        for(int i=2;i<nums.length;i++){
             if(arr1[j]>arr2[k]){
                j++;
                arr1[j]=nums[i];
             }else{
                k++;
                arr2[k]=nums[i];
             }
        }
        int l=0;
        for(int i=j+1;i<arr1.length;i++ ){
            arr1[i]=arr2[l++];
        }
 return arr1;
    }
}