class Solution {
public:
    int XXX(int n) {
        vector<int> result(n);
        if (n == 0 || n == 1 || n == 2) return n;
        result[0] = 1;
        result[1] = 2;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n - 1];
    }
};

