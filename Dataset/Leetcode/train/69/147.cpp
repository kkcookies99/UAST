class Solution {
public:
    int XXX(int x) {
        if (x <= 1) return x;
        long r = x;
        while (r > x / r) {
            r = (r + x / r) / 2;
        }
        return r;
    }
};

