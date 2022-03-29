 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        auto matrix_copy = matrix;
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                matrix_copy[j][n-i-1] = matrix[i][j];

        matrix = matrix_copy;
    }
};

