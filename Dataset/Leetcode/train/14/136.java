 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String s  = strs[0];
        int len = Integer.MAX_VALUE;
        for(String tmp:strs){
            int start = 0;
            while(start<tmp.length()){
                if(start<s.length() && tmp.charAt(start)==s.charAt(start)){
                    start++;
                }else{
                    break;
                }
            }
            len = Math.min(len,start);
        }
        if(len==0){
            return "";
        }
        return s.substring(0,len);
    }
}

