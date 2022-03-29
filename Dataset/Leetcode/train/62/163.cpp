 class Solution {
public:
    int XXX(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        vector<vector<int> >v(m, vector<int>(n, 0));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0) {
                    v[i][j] = 1;
                }
                if (j == 0 && i > 0) {
                    v[i][j] = 1;
                }
                
                if (i > 0 && j > 0) {
                    v[i][j] = v[i][j - 1] + v[i - 1][j];
                } 
            }
        }
        return v[m-1][n-1];
    }
};

