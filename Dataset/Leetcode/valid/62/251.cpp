 class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>> f(m, vector<int>(n));
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                if((i == 0 && j == 0) || i == 0 || j == 0) {
                    f[i][j] = 1;
                } else {
                    f[i][j] = f[i][j - 1] + f[i - 1][j];
                }
            }
        }
        return f[m - 1][n - 1];
    }
};

