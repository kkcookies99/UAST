 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int temp = 0;
        int n = matrix.size();
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (i != j){
                    swap(matrix[i][j], matrix[j][i]);
                }
            }
        }

        for (int j = 0; j < n / 2; j++){//列
            for (int i = 0; i < n; i++){//行
                swap(matrix[i][j], matrix[i][n - j - 1]);
            }
        }
    }
};

