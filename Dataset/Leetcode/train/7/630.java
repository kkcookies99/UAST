 class Solution {
    public int XXX(int x) {
        int result = 0;
        boolean neg = false;
        if (x < 0) {
            neg = true;
        }
        x = Math.abs(x);
        while (x != 0) {
            if (result != 0 && Integer.MAX_VALUE / result < 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return neg ? -result:result;
    }
}

