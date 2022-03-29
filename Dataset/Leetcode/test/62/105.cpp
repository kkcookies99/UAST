 class Solution {
public:
    int XXX(int m, int n) {
        long long res = 1;
        if (m > n) {
            for (int i = m; i <= m + n - 2; ++i) {
                res *= i;
            }
            for (int i = 1; i < n; ++i) {
                res /= i;
            }
        } else {
            for (int i = n; i <= m + n - 2; ++i) {
                res *= i;
            }
            for (int i = 1; i < m; ++i) {
                res /= i;
            }
        }
        return res;
    }
};

