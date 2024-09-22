class Solution {
    public int tribonacci(int n) {
        int first=0;
        int second=1;
        int third=1;
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }
        int sum=0;
        for(int i=3;i<=n;i++){
            sum=first+second+third;
            first=second;
            second=third;
            third=sum;
        }
        return sum;
    }
}