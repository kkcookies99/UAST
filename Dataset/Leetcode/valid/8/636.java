 class Solution {
    public int XXX(String s) {
        s = s.strip();
        int flag = 1;
        long ret = 0;
        int i = 0;
        int N = s.length();
        if (N == 0) {
            return 0;
        }
        if (s.charAt(0) == '+') {
            i = 1;
        } else if (s.charAt(0) == '-') {
            i = 1;
            flag = -1;
        }
        for (; i < N; i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9' ) {
                ret = ret * 10 + flag * (long) (c - '0');
            } else {
                break;
            }
            if (ret > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (ret < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)ret;
    }
}

