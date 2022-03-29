 class Solution {
    public String XXX(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String str=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(str)!=0){
                str=str.substring(0,str.length()-1);
            }
        }
        return str;
    }
}




