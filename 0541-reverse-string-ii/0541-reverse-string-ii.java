class Solution {
    public String reverseStr(String s, int k) {
       
        ArrayList<Character> list=new ArrayList<>();
        if(s.length()<k){
            String str3="";
    for(int i=s.length()-1;i>=0;i--){
        str3+=s.charAt(i);
    }
    return str3;
        }
        else{
            
        int mod=s.length()%k;
        int n=1;
        for(int i=0;i<s.length()/k;i++){
            
            if(i%2==0){
                for(int j=(n*k)-1;j>=i*k;j--){
                 list.add(s.charAt(j));
                }
            }else{
                for(int m=i*k;m<n*k;m++){
                    list.add(s.charAt(m));
                }
            }
            n++;
        }
        int val=s.length()-mod;
         String str2="";
        if(s.length()/k%2!=0){
       
        for(int i=val;i<s.length();i++){
            list.add(s.charAt(i));
        }
        
        for(int i=0;i<list.size();i++){
            str2+=list.get(i);
        }
      return str2;
        }else{
          
        for(int i=s.length()-1;i>=val;i--){
            list.add(s.charAt(i));
        }
       
        for(int i=0;i<list.size();i++){
            str2+=list.get(i);
        }

      return str2;


        }
        }
    }
}