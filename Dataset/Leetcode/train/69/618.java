class Solution {
    public int XXX(int x) {
        if (x==1) return 1;
        int start = 1;
        int end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if ((long)mid * mid < x) {
                if ((long)(mid + 1) * (mid + 1) > x) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            } else if ((long)mid * mid > x) {
                if ((long)(mid - 1) * (mid - 1) < x) {
                    return mid - 1;
                } else {
                    end = mid;
                }
            } else {
                return mid;
            }
        }
        return 0;
    }
}

