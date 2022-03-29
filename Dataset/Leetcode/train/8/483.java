 class Solution {
    public int XXX(String s) {
        if (s.length() == 0) return 0;
        char[] str = s.toCharArray();
        int op = 1, start = 0, n = str.length;
        long res = 0;
        while (start < n && str[start] == ' ') start++;
        if (start < n && (str[start] == '-' || str[start] == '+')) {
            op = str[start] == '-' ? -1 : 1; 
            start++;
        }
        for (int i = start; i < n; i++) {
            if (!check(str[i])) break;
            res = res * 10 + str[i] - '0';
            long cur = op * res;
            if (cur > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (cur < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        res = res * op;
        return (int) res;
    }
    
    boolean check (char c) {
        return c >= '0' && c <= '9';
    }                                   
}

