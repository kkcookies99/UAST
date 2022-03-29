class Solution {
public:
    int XXX(int n) {
        int f0 = 1, f1 = 1;
        if (n < 2) {
            return n;
        }
        int f2;
        for (int i = 2; i <= n; ++i) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
};

