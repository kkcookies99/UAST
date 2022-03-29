class Solution {
    public static int XXX(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            if (result > 214748364 || (result == 214748364 && digit > 7)) {
                //正数溢出
                return 0;
            }
            if (result < -214748364 || (result == -214748364 && digit < -8)) {
                //负数溢出
                return 0;
            }
            result = result * 10 + digit;
            x /= 10;
        }
        return result;
    }
}

