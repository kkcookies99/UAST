 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i ++) {
            res = stringCommonPre(res, strs[i]);
            if ("".equals(res)) {
                return "";
            }
        }
        return res;
    }

    // 取两个字符串公共前缀
    public String stringCommonPre(String a, String b) {
        int n = Math.min(a.length(), b.length());
        int i = 0;
        for (; i < n ; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                break;
            }
        }
        return a.substring(0, i);
    }
}

