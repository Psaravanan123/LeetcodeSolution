class Solution {
    public int passThePillow(int n, int t) {
        int acc=t/(n-1);
        int mod=t%(n-1);
       
        if(acc%2==0){
            return 1+mod;
        }else{
            return n-mod;
        }


    }
}