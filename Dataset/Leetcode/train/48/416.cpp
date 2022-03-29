 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        // 不使用额外空间，直接原地替换
        int e = matrix.size()-1;
        if (e < 1) return ;
        for (int i = 0; i <= e/2; i++){
            for (int j = i; j < e-i; j++){
                int tmp = matrix[i][j];
                // 完成相应位置的坐标转换
                matrix[i][j] = matrix[e-j][i];
                matrix[e-j][i] = matrix[e-i][e-j];
                matrix[e-i][e-j] = matrix[j][e-i];
                matrix[j][e-i] = tmp;
            }
        }
        return ;
    }
};

