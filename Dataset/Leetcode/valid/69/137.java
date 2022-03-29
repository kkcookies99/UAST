class Solution {
    public int XXX(int x) {
        int lo = 1, hi = x, mid;
        while(hi >= lo) {
            mid = lo + hi >>> 1;
            if(x / (mid + 1) > mid)
                lo = mid + 1;
            else if (x / mid < mid)
                hi = mid - 1;
            else
                return mid;
        }
        return 0;
    }
}

