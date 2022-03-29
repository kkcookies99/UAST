class Solution {
public:
    int XXX(int x) {
        if (x == 0)
            return 0;
        double sqrt_x = x;
        while(x < pow(int(sqrt_x), 2) || x >= pow(int(sqrt_x) + 1, 2)) {
            sqrt_x = sqrt_x/2 + x / (2 * sqrt_x);
        }
        return int(sqrt_x);
    }
};

