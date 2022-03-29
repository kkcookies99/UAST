class Solution {
    public int XXX(String s) {
        long n = 0;
        int p = 2;
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 32) {
                if (p == 1 || p == -1) break;
                if (x == 0) {
                    continue;
                } else break;
            }
            if (c == 43) {
                if (p == 1 || p == -1) break;
                if (x == 0) {
                    p = 1;
                    continue;
                } else break;
            }
            if (c == 45) {
                if (p == 1 || p == -1) break;
                if (x == 0) {
                    p = -1;
                    continue;
                } else break;
            }
            if ((int) c >= 48 && (int) c <= 57) {
                if (n > 0) {
                    y++;
                    n *= 10;
                }
                n += (c - 48);
                x++;
            } else break;
        }
        if (p == 2) p = 1;
        if (y > 18) return p > 0 ? 2147483647 : -2147483648;
        return (int) n != n ? (p > 0 ? 2147483647 : -2147483648) : (int) n * p;
    }
}

