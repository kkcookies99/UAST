 class Solution {
    public String XXX(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        int len = strs.length;

        if (len == 0 || strs == null) {
            return "";
        }

        for (String ss: strs) {
            minLen = Math.min (minLen, ss.length());
        }
        int count = minLen;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < minLen; j++) {
                if (strs[i-1].charAt(j) != strs[i].charAt(j)) {
                    count = Math.min (count, j);
                    break;
                }
            }
        }
        return strs[0].substring (0, count);
    }
}

