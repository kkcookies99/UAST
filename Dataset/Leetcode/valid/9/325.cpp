class Solution {
public:
    bool XXX(int x) {
        if (x < 0) return false;
        int y = 0;
        for (int t = x; t && y <= INT_MAX / 10; t /= 10) {
            y = y * 10 + t % 10;
        }
        return x == y;
    }
};

