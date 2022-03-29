 class Solution {
    public String XXX(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        int len=Math.min(strs[0].length(),strs[strs.length-1].length());
        for(int i=0;i<len;++i){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                continue;
            }else{
                return strs[0].substring(0,i);
            }
        }
        return strs[0].substring(0,len);
        
    }
}

