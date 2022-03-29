class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>> save(m, vector<int>(n, 1));
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                save[i][j] = save[i - 1][j] + save[i][j - 1];
            }
        }
        return save[m - 1][n - 1];
    }
};

