class Solution {
    public int XXX(String str) {
        int index = 0, length = str.length(), sign = 1;
        char[] chars = str.toCharArray();

        // whitespace
        while (index < length && chars[index] == ' ') {
            index++;
        }

        // sign
        if (index < length && (chars[index] == '+' || chars[index] == '-')) {
            if (chars[index] == '-') {
                sign = -1;
            }
            index++;
        }

        // number
        long res = 0;
        while (index < length && chars[index] >= '0' && chars[index] <= '9') {
            res = res * 10 + chars[index++] - '0';
            if (res >= Integer.MAX_VALUE) {
                break;
            }
        }

        // boundary
        res = res * sign;
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res;
    }
}

