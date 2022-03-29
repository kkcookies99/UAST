class Solution {
public:
    int XXX(int m, int n) {
        return round(tgamma(m + n - 1) / tgamma(m) / tgamma(n));
    }
};

