 class Solution {
    public int XXX(String s) {
        int idx = 0, n = s.length(), res = 0;
        char[] chars = s.toCharArray();
        while (idx < n && chars[idx] == ' ') idx++;
        if (idx >= n) return res;
        int prefix = 1;
        if (chars[idx] == '-') prefix = -1;
        if (chars[idx] == '-' || chars[idx] == '+') idx++;
        long val = 0;
        while (idx < n && chars[idx] >= '0' && chars[idx] <= '9') {
            val = val * 10 + chars[idx]-'0';
            if (prefix > 0 && val > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (prefix < 0 && -val < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            idx++;
        }
        return (int)val * prefix;
    }
}

