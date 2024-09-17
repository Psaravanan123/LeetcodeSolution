class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       List<String> type=new ArrayList<>();
       List<String> color=new ArrayList<>();
       List<String> name=new ArrayList<>();
       for(int i=0;i<items.size();i++){
         List<String> ref=items.get(i);
        
        type.add(ref.get(0));
        color.add(ref.get(1));
        name.add(ref.get(2));
       }
       int count=0;
       if(ruleKey.equals("type")){
         for(int i=0;i<type.size();i++){
             if(type.get(i).equals(ruleValue)){
                count++;
             }
         }
       }else if(ruleKey.equals("color")){
           for(int i=0;i<color.size();i++){
             if(color.get(i).equals(ruleValue)){
                count++;
             }
         }
       }else{
        for(int i=0;i<name.size();i++){
             if(name.get(i).equals(ruleValue)){
                count++;
             }
         }
       }
       return count;
    }
}