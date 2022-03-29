class Solution {
public:
    int XXX(int m, int n) {
        // C(m + n - 2, m - 1);
        if (m < n) std::swap(m, n);
        long res = 1;
        for (int i = m + n - 2, j = 1; i > m - 1; --i, ++j) {
            res *= i;
            if (j <= n - 1) res /= j;
        }
        return res;
    }
};

