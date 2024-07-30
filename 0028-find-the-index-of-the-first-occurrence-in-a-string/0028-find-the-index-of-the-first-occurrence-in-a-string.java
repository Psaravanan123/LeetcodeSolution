class Solution {
    public int strStr(String h, String n) {
        int count=0;
        if(n.length()==0){
            return 0;
        }
        if(n.length()>h.length()){
            return -1;
        }
           for (int i = 0; i <= h.length() - n.length(); i++) {
            if (h.charAt(i) == n.charAt(0)) {
                if (check(i, h, n)) {
                    return i;
                }
            }
        }
            
        return -1;
    }
    public boolean check(int val,String h,String n){
        int count=0;
        for(int i=0;i<n.length();i++){
            if(h.charAt(val)==n.charAt(i)){
                val++;
                count++;
            }
        }
        if(count==n.length()){
            return true;
        }else{
            return false;
        }
    }
}