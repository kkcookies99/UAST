class Solution {
public:
    int XXX(int x) {
        int res = 0;
        while (x) {
            if (x > 0 && res > (INT_MAX - x % 10) / 10) return 0;
            if (x < 0 && res < (INT_MIN - x % 10) / 10) return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
};

