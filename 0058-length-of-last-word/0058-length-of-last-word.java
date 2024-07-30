class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
     while(true) {
        if(s.charAt(i)==' '){
         i--;
        }else{
            return check(s,i);
        }
     } 
    }
    public int check(String s,int n){
        int count=0;
        for(int i=n;i>=0;i--){
            if(s.charAt(i)!=' ' ){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}