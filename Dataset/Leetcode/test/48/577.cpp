 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        if(n <= 1){
            return;
        }
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < i; ++j){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }//转置
        for(int j = 0; j < n / 2; ++j){
            for(int i = 0; i < n; ++i){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }
};

