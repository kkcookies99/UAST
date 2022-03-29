 class Solution {
public:
    bool XXX(int x) {
        // remove negative
        if (x < 0) return false;

        long y = 0, xp = x;
        while (xp) {
            y = y * 10 + xp % 10;
            xp /= 10;
        }

        return y == x;
    }
};

