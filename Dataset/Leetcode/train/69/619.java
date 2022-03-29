class Solution {
    public int XXX(int x) {
        if (x == 1) {
            return 1;
        }
        int start = 1;
        int end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < x/mid) {
                if ((mid + 1) > x/(mid + 1)) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            } else if ( mid > x/mid) {
                if ((mid - 1) < x/(mid - 1)) {
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

