class Solution {
public:
    int XXX(int n) {
        int x = 1, y = 2;
        if (n == 1) return x;
        if (n == 2) return y;
        for (int i = 3; i <= n; i++) {
            int tmp = y;
            y = x + y;
            x = tmp;
        }
        return y;
    }
};

