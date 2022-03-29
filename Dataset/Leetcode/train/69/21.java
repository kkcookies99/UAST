class Solution {
    public int XXX(int x) {
        long left = 1;
        long right = x;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long t = mid * mid;
            if (t == x) {
                return (int)mid;
            } else if (t < x) {
                left = mid + 1;
            } else if (t > x) {
                right = mid - 1;
            }
        }
        return (int)right;
    }
}

