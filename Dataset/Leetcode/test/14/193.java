 class Solution {
    public String XXX(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        // 先算一下最短的字符串长度，把拿来匹配用的字符串给截取下
        int minLg = Integer.MAX_VALUE, lg = strs.length;
        for(int i = 0; i < lg; i++) {
            minLg = Math.min(minLg, strs[i].length());
        }
        String res = strs[0].substring(0, minLg);
        for(int i = 1; i < lg && res.length() > 0; i++) {
            while(!strs[i].startsWith(res)) {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }
}

