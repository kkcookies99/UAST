class Solution {
public:
    bool XXX(int x) {
        if (x < 0)      return false;
        int y = x;
        int res = 0;
        while (y) {
            int m = y % 10;
            if (res > (INT_MAX - m) / 10)
                return false;
            res = res * 10 + m;
            y /= 10;
        }
        return res == x;
    }
};

