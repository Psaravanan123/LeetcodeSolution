class Solution {
    public int sumOfEncryptedInt(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
         int val=arr[i];
         int size=0;
         while(val>0){
            val/=10;
            size++;
         }
         int great=0;
         while(arr[i]>0){
           if(arr[i]%10>great){
            great=arr[i]%10;
           }
           arr[i]/=10;
         }
         int res=0;
         for(int j=0;j<size;j++){
            res=res*10+great;
         }
         sum+=res;
        }
    return sum;
    }
}