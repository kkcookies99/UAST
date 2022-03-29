class Solution {
public:
    int XXX(int x) {
        uint64_t i;
        double x2, y;
        x2 = x * 0.5;
        y = x;
        i = *(uint64_t *) &y;
        i = 0x5fe6eb50c7b537a9 - (i >> 1);
        y = *(double *) &i;
        y = y * (1.5 - (x2 * y * y));
        y = y * (1.5 - (x2 * y * y));
        y = y * (1.5 - (x2 * y * y));
        y = y * (1.5 - (x2 * y * y));
        return x * y;
    }
};

