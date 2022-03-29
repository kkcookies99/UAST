class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>> f(m+1, vector<int>(n+1, 1));
        for(int i = 2; i<=m; i++)
            for(int j = 2; j<=n; j++)
                f[i][j] = f[i-1][j] + f[i][j-1];
        return f[m][n];
    }
};

