class Solution {
    public int XXX(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        long start = 0;
        long end = x;
        while (start < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (start * start > x) {
            start = start - 1;
        }
        return (int) start;
    }
}

