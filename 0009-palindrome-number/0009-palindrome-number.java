class Solution {
    public boolean isPalindrome(int x) {
        int ref=x;
        int sum=0;
        while(ref>0){
            sum=sum*10+ref%10;
            ref=ref/10;
        }
        if(sum==x){
            return true;
        }else{
            return false;
        }
    }
}