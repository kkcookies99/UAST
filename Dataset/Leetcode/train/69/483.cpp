class Solution {
public:
    int XXX(int x) {
        double l = 0, r = x;
        while(abs(l - r) > 1e-8)
        {
            double mid = (l + r) / 2;
            if (x > mid * mid) l = mid;
            else r = mid;
        }
        return r;
    }
};

