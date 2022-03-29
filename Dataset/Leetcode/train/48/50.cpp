class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        size_t length = matrix.size();

        // 反转
        reverse(matrix.begin(), matrix.end());
        // 对角线翻转
        for (size_t i = 0; i < length; i++) {
            for (size_t j = 0; j < i; j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
    }
};

