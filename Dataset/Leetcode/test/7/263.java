class Solution {
   public:
    int XXX(int x) {
        if (x == INT32_MIN) return 0;
        bool sign = x < 0;
        x = abs(x);
        const int limit = INT32_MAX / 10;
        const int digit = 7 + sign;
        int r = 0;
        do {
            int m = x % 10;
            if (r > limit || r == limit && m > digit) return 0;
            r *= 10;
            r += m;
        } while ((x /= 10));
        return sign ? -r : r;
    }
};

