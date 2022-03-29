 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> v;
        for (int i = 0; i < m; ++i)
        {
            for (int j = n-1; j >= 0; --j)
            {
                v.push_back(matrix[j][i]);
            }
        }

        for (int i = 0; i < m; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                matrix[i][j] = v[i*m+j];
            }
        }
    }
};

