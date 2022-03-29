 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) return "";
        String minStr = strs[0];
        for (String str : strs) {
            if (str.length() < minStr.length()) {
                minStr = str;
            }
        }
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(minStr)) {
                minStr = minStr.substring(0, minStr.length() - 1);
                i = -1;
            }
        }
        return minStr;
    }
}

