class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int m = (n + 1) / 2;
        for (int i = 0; i < m; i++){
            int len = n - 2 * i;
            for(int j = 0; j < len - 1; j ++){                
                int tmp = matrix[i][i + j];
                matrix[i][i + j] = matrix[n - 1 - i - j][i];
                matrix[n - 1- i - j][i] = matrix[n - 1 - i][n - 1- i - j];
                matrix[n - 1 - i][n - 1- i - j] = matrix[i + j][n - 1- i];
                matrix[i + j][n -1 - i] = tmp;
            }
        }
        return ;
    }
};

