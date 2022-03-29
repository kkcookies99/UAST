class Solution {
    public int XXX(int x) {
        int a = 0;
        long b = 0;
        while (x != 0) {
            a = x % 10;
            x = x / 10;
            b = b * 10 + a;
            if (b >= Integer.MAX_VALUE || b <= Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)b;
    }
}

