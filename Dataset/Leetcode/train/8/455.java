 class Solution {
    public int XXX(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        int negative = 1;
        if (s.charAt(0) == '-') negative = -1;
        else if (s.charAt(0) == '+') negative = 1;
        int start = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') start = 1;
        long res = 0;
        while (start < s.length()) {
            if (s.charAt(start) < '0' || s.charAt(start) > '9') break;
            if ((res = res * 10 + s.charAt(start++) - '0') > Integer.MAX_VALUE) break;
        }
        return (res *= negative) > Integer.MAX_VALUE ? Integer.MAX_VALUE : res < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) res;
    }
}

