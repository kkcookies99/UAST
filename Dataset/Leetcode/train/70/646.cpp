class Solution {
public:
    int XXX(int n) {
        int a[3] = { 1, 2, 3 };
        for (int i = 3; i < n; ++i)
            a[i % 3] = a[(i + 1) % 3] + a[(i + 2) % 3];
        return a[(n - 1) % 3];
    }
};

