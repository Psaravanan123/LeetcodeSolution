class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int size=arr1.length+arr2.length;
       int merge[]=new int[size];
       for(int i=0;i<arr1.length;i++){
        merge[i]=arr1[i];
       }
       int j=arr1.length;
       for(int i=0;i<arr2.length;i++){
        merge[j]=arr2[i];
        j++;
       }
       Arrays.sort(merge);
     
      if(size%2==0){
         int sz=(0+size-1)/2;
          double mid2=(double)(merge[sz]+merge[sz+1])/2;
          System.out.print("hi");
         return mid2;
        
      }else{
        
        double mid=merge[(0+size-1)/2];
        return mid;
      }






    //    for(int i=0;i<size;i++){
    //     System.out.print(merge[i]);
    //    }
     
    }
}