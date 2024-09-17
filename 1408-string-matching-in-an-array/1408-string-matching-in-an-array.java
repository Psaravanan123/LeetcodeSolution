class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int ref=0;
            for(int j=0;j<words.length;j++){
                if(i!=j){
                    for(int k=0;k<words[j].length();k++){
                if(words[j].charAt(k)==words[i].charAt(0)){
                     if(check(words[j],words[i],k)){
                        list.add(words[i]);
                        ref=1;
                     }
                     if(ref==1){
                        break;
                     }
                }
                }
                }
                if(ref==1){
                    break;
                }
            }
        }
        return list;
    }
        public static  boolean check(String str1,String str2,int index){
            
            for(int i=0;i<str2.length();i++){
                if(index<str1.length()){
                 if(str2.charAt(i)!=str1.charAt(index++)){
                    return false;
                 }
                }else{
                    return false;
                }
            }
            return true;
        }
    
}