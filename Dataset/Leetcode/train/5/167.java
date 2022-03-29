 class Solution {
    public String XXX(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        int maxLen = 0;
        int start = 0, end = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            // aba 这种情况
            int len1 = findMaxLen(s, i, i);
            // aa 这种情况
            int len2 = findMaxLen(s, i, i + 1);
            // aba 这种情况, 求到的len一定是个奇数
            if (len1 > maxLen) {
                maxLen = len1;
                start = i - maxLen / 2;
                end = i + maxLen / 2;
            }
            // aa 这种情况, 求到的len一定是个偶数
            if (len2 > maxLen) {
                maxLen = len2;
                start = i - maxLen / 2 + 1;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int findMaxLen(String s, int start, int end) {
        // 只要相等, 就不断向两边扩展
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}

