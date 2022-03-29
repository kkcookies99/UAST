class Solution {
public:
    int XXX(int x) {
        int r =  0;
        while (x)
        {
            if (r > 0 && r > (INT_MAX - x % 10) / 10) return 0;
            if (r < 0 && r < (INT_MIN - x % 10) / 10) return 0;
            r = r * 10 + x % 10;
            x /= 10;
        }
        return r;
    }
};

