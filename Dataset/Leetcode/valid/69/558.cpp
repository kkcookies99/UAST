class Solution {
public:
    int XXX(int x) {
        if (x == 0) return 0;
        double c = x, x0 = x;
        while (true)
        {
            double x1 = 0.5 * (x0 + c / x0);
            if (fabs(x1 - x0) < 1e-7) break;
            x0 = x1;
        }
        return int(x0);
    }
};

