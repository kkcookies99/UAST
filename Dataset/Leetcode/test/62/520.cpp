class Solution {
public:
    int XXX(int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        vector<vector<int> > num_paths(m + 1, vector<int> (n + 1, 0));
        num_paths[1][1] = 1;
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i == 1 && j == 1) {
                    continue ;
                }
                num_paths[i][j] = num_paths[i - 1][j] + num_paths[i][j - 1];
            }
        }
        return num_paths[m][n];
    }
};

