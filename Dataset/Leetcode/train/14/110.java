 class Solution {
    public String XXX(String[] strs) {
      String com ="";
      if(strs.length==0){
          return "";
      }
      System.out.println(strs[0]);
      for(int i=0;i<(strs[0]).length();i++){
        for(int j=1;j<strs.length;j++){
 if( (i>=strs[j].length())||(strs[0].charAt(i)!=strs[j].charAt(i))){
                return com;
            }           
        }
     com=com+strs[0].charAt(i);
    }
    return com;
}
}

