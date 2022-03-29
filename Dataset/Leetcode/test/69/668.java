class Solution {
    public int XXX(int x) {
        long left = 0, right = x;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                if ((mid + 1) * (mid + 1) > x) {
                    return (int) mid;
                } else {
                    left = mid + 1;
                }
            } else if (mid * mid > x) {
                if ((mid - 1) * (mid - 1) <= x) {
                    return (int) (mid - 1);
                } else {
                    right = mid - 1;
                }
            }
        }
        throw null;
    }
}

