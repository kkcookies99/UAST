 class Solution {
    public String XXX(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            int len = str.length();
            if (len < minLen) {
                minLen = len;
            }
        }
        for (int i = 0; i < minLen; i++) {
            int n = strs.length;
            char ch = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (strs[j].charAt(i) != ch) {
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}

