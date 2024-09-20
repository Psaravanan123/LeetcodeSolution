class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int arr[]=new int[1001];
        for(int i=0;i<arr1.length;i++){
            arr[arr1[i]]++;
        }
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        int r=0;
        for(int i=0;i<arr1.length;i++){
            int count=0;
            for(int k=0;k<arr2.length;k++){
               if(arr2[k]==arr1[i]){
                count++;
               }
            }
            if(count==0){
                 list.add(arr1[i]);
            }
        }
        Collections.sort(list);
        for(int i=0;i<arr2.length;i++){
            for(int k=0;k<arr[arr2[i]];k++){
               arr1[j++]=arr2[i];
            }
        }
        int k=0;
        for(int i=arr1.length-list.size();i<arr1.length;i++){
            arr1[i]=list.get(k++);
        }
        System.out.print(list);
        return arr1;
    }
}