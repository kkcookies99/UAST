 class Solution {
    public int XXX(String haystack, String needle) {
        if (null == haystack || null == needle) {
            return 0;
        }
        int m = haystack.length();
        int n = needle.length();
        if (m < n) {
            return -1;
        }
        if (haystack.equals(needle) || n == 0) {
            return 0;
        }
        char prefix = needle.charAt(0);
        for (int i = 0; i < m; i ++) {
            if (prefix == haystack.charAt(i)) {
                // 首字母相同
                int start = i;
                int end = i + n;
                if (end > m) {
                    return -1;
                }
                if (haystack.substring(start, end).equals(needle)) {
                    return start;
                }
            }
        }
        return -1;
    }
}

