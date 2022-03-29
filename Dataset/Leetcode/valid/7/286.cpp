class Solution {
public:
    int XXX(int x) {
        int y = 0;
        while (x != 0) {
            if (y > INT_MAX / 10 || y < INT_MIN / 10) {
                return 0;
            }
            y *= 10;
            if (x >= 0) {
                if (y > INT_MAX - x % 10) {
                    return 0;
                }
            } else {
                if (y < INT_MIN - x % 10) {
                    return 0;
                }
            }
            y += x % 10;  
            x /= 10;
        }
        return y;
    }
};

