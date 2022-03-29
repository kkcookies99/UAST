class Solution {
    public int XXX(int x) {
        if (x == 0) {
            return 0;
        }
        long l = 1;
        long h = x;
        while (l < h) {
            long mid = (l + h + 1) / 2;
            long midSquare = mid * mid;
            if (midSquare == x) {
                return (int) mid;
            }
            if (midSquare > x) {
                h = mid - 1;
            } else {
                l = mid;
            }
        }
        return (int) l;
    }
}

