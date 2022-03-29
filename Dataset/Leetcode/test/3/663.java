 class Solution {
    public int XXX(String s) {
        if (s == null) {
            return 0;
        }
        int maxLen = 0;
        int len = 0;
        int index;
        char a;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            index = s.indexOf(a);
            if (index < i) {
                len = i;
                if ((index + 1) > s.length()) {
                    if (maxLen < len) {
                        maxLen = len;
                    }
                    break;
                }
                i = i - index - 1;
                s = s.substring(index + 1);
            } else {
                len = i + 1;
            }
            if (maxLen < len) {
                maxLen = len;
            }
            if (s.length() < maxLen) {
                break;
            }
        }
        return maxLen;
    }
}
执行用时 :
62 ms
内存消耗 :
42 MB

