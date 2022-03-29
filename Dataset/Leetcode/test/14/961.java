 class Solution {
    public String XXX(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        String lcp = strs[0];


        for(String s : strs){
            for(int i = 0; i < lcp.length(); i ++){
                if(i >= s.length()){
                    lcp = s;
                    break;
                }
                if(lcp.charAt(i) != s.charAt(i)){
                    lcp = lcp.substring(0, i);
                    break;
                }
            }
        }

        return lcp;
    }
}

