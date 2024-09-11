class Solution {
    public int minBitFlips(int start, int goal) {
     String str1="";
     String str2="";
       while(start!=0&&start!=1) {
       str1=start%2+""+str1;
       start=start/2;
       }
       str1=start+""+str1;
            while(goal!=0&&goal!=1) { 
       str2=goal%2+""+str2;
       goal=goal/2;
       }
       str2=goal+""+str2;
       if(str1.length()>str2.length()){
       int n=str1.length()-str2.length();
       for(int i=0;i<n;i++){
          str2=0+""+str2;
       }
       }else{
  int n=str2.length()-str1.length();
       for(int i=0;i<n;i++){
          str1=0+""+str1;
       }
       }
       int count=0;
       for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)!=str2.charAt(i)){
            count++;
        }
       }
       
       return count;
    }
}