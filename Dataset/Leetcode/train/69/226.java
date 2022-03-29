class Solution {
    public int XXX(int x) {
        if (x == 0) return x;
        int sqrt = x;
        int l = 1, r = x;
        int mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            sqrt = x / mid;
            if (mid == sqrt) {
                return mid;
            } else if (mid > sqrt) {
                r = mid - 1;
            } else if (mid < sqrt) {
                l = mid + 1;
            }
        }
        return r;
    }
}

