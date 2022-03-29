class Solution {
public:
    int XXX(int x) {
        int64_t xi = x;
        while (xi*xi > x)
            xi = (xi + x / xi) / 2;
        return xi;
    }
};

