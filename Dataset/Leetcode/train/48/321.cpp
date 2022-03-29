class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for (int i = 0; i < n; i ++ )
            for (int j = 0; j < i; j ++ )
                swap(matrix[i][j], matrix[j][i]);

        for (int i = 0; i < n; i ++ )
            for (int j = 0, k = n - 1; j < k; j ++, k -- )
                swap(matrix[i][j], matrix[i][k]);
    }
};


