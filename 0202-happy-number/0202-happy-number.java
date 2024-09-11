class Solution {
    public boolean isHappy(int n) {

        while( n>9){
        int sum=0;
            while(n>0){
                int digits=n%10;
               sum+=digits*digits;
                n=n/10;
            }
            n=sum;
            System.out.print(n);
        }
        if(n==1||n==7){
            return true;
        }else{
            return false;
        }
    }
}