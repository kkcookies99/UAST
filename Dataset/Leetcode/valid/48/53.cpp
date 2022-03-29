class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for(int i = 0; i < n/2; ++i)
        {
            for(int j = 0; j < n-1-i*2; ++j){
                int tp = matrix[i+j][n-1-i];
                matrix[i+j][n-1-i] = matrix[i][j+i];
                matrix[i][j+i] = matrix[n-1-i-j][i];
                matrix[n-1-i-j][i] = matrix[n-1-i][n-1-i-j];
                matrix[n-1-i][n-1-i-j] = tp;
            }
        }
        return;
    }
};

