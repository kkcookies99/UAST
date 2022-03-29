 class Solution {
    public String XXX(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String s = strs[0];
        for(String str : strs) {
            while(str.indexOf(s) != 0) {
                s = s.substring(0, s.length()-1);
            }
        }
        return s;
    }
}

