class Solution {
    public int XXX(int x) {
        if(x <= 1) {
            return x;
        }
        double l = 0, r = x, mid, t;
        while(l <= r) {
            mid = (l + r) / 2;
            t = mid * mid - x;
            if(Math.abs(t) < 1e-3) {
                return (int)mid;
            } else if(t > 0) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return 0;
    }
}



