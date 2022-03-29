 class Solution {
    public static int XXX(String s) {
        char[] chars = s.toCharArray();
        int a = 0;
        boolean positive = true;
        final boolean jieshuqiandao;
        int count = 0;
        int i = 0;
        for (; i < s.length(); i++) {
            if (chars[i] == ' ') {
                continue;
            } else {
                break;
            }
        }
        if (chars[i] == '+') {
            i++;
        } else if (chars[i] == '-') {
            positive = false;
            i++;
        }
        for (; i < s.length(); i++) {
            if (a > Integer.MAX_VALUE / 10) {
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else if (a == Integer.MAX_VALUE / 10) {
               if ((int) chars[i] - 48 > 7) {
                    return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            if ((int) chars[i] < 48 || (int) chars[i] > (48 + 9)) {
                return 0;
            }
            int digit = (int) chars[i] - 48;
            if (digit > 9 || digit < 0) {
                return positive ? a : a * -1;
            }
            a = a * 10 + digit;
        }
        return positive ? a : a * -1;
    }
}


