 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();

        // 转置
        for (int i = 0; i < n; i ++) {
            for (int j = i; j < n; j ++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }

        // 以y轴翻转
        for (int i = 0; i < n; i ++) reverse(matrix[i].begin(), matrix[i].end());
    }
};

