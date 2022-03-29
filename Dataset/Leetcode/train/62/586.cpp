class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>> mark(n,vector<int>(m,1));
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                mark[i][j] = mark[i-1][j] + mark[i][j-1];
            }
        }
        return mark[n-1][m-1];
    }
};

