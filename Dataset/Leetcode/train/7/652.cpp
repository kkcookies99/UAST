 class Solution {
public:
    int XXX(int x) {
        int res = 0;
        while (x) {
            if (INT_MAX / 10 < res || INT_MAX / 10 == res && x % 10 > 7) return 0;
            if (INT_MIN / 10 > res || INT_MIN / 10 == res && x % 10 < -8) return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
};

