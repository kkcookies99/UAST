 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        // 先把行翻转一下
        reverse(matrix.begin(), matrix.end());

        // 然后转置矩阵
        int n = matrix.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
    }
};

