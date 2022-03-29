 class Solution {
    public int XXX(int x) {
        long res = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            res = res * 10 + temp;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) res;
    }
}

