 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for (int i = 0; i < n; ++i) {
            reverse(matrix[i].begin(), matrix[i].end());
        }
        // n = 3;
        // i = 0;               i = 1;
        // j = n - 0 - 1 = 2;   j = 1;
        for (int i = 0; i <= n - 1; ++i) {
            int j = n - i - 1;
            for (int ii = i, jj = j; ii <= n -1 && jj >= 0; ++ii, --jj) {
                swap(matrix[i][jj], matrix[ii][j]);
            }
        }
    }
};```

