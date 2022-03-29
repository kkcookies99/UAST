class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();
 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i >= j)continue;
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n / 2; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = t;
            }
        }
    }
};

