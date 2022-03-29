 class Solution {
    public String XXX(String[] strs) {
        String s = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            int j, k;
            for (j = 0, k = 0; j < strs[i].length() && k < s.length(); ++j, ++k) {
                if (strs[i].charAt(j) != s.charAt(k)) {
                    s = s.substring(0, k);
                    break;
                }
            }
            if (k != s.length()) {
                s = s.substring(0, k);
            }
        }
        return s;
    }
}

