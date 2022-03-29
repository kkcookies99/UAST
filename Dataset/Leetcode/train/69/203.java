class Solution {
    public int XXX(int x) {
        if (x <= 1) return x;
        long left = 0, right = x;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (x < mid * mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }
}

