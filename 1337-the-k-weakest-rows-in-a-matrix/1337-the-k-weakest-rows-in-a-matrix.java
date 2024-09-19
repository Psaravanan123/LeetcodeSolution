class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[]=new int[mat.length];
        int acc[]=new int[mat.length];
        int res[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
              count+=mat[i][j];
            }
            arr[i]=count;
            acc[i]=count;
        }
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            for(int j=0;j<acc.length;j++){
                if(arr[i]==acc[j]){
                    res[i]=j;
                    acc[j]=-2;
                    break;
                }
            }
        }
        return res;
    }
}