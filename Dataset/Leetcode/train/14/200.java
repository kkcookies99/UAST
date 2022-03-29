 class Solution {
    public String XXX(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String[] str2 = strs[0].split("");
        Integer a = strs.length;
        String s ="";
        for(int i =0;i<str2.length;i++){
           s = s+str2[i];
            for(int j=1;j<a;j++){
                if (!strs[j].startsWith(s)){
                     s =  s.substring(0,s.length()-1);
                    return s;
                }
            }
        }
        return s;
    }
}

