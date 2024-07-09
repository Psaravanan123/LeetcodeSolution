class Solution {
    public int[] createTargetArray(int[] arr, int[] index) {
        
        ArrayList<Integer> list=new ArrayList<>();
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            list.add(index[i],arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr1[i]=list.get(i);
        }
        return arr1;
    }
}