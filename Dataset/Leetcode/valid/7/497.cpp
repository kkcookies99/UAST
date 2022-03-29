 class Solution {
public:
    int XXX(int x) {
        int reX = 0;
        while (x) {
            if (abs(reX) > 214748364 || abs(reX * 10 + (x % 10)) >= 2147483646 ) {
                return 0;
            }
            reX *= 10;
            reX += (x % 10);
            x /= 10;
        }
        return reX;
    }
};

