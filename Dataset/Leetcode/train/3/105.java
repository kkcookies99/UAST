 class Solution {
    public int XXX(String s) {
        int length = s.length();
        if (length < 1) return 0;
        int maxLen = 1;
        for (int head = 0, tail = 1; tail < s.length(); tail++) {
            char c = s.charAt(tail);
            int index = s.indexOf(c, head);
            if (index < tail) {
                head += (index - head + 1);
            }
            int len = tail - head + 1;
            maxLen = len > maxLen ? len : maxLen;
        }
        return maxLen;
    }
}

