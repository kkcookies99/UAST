class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        // 上下翻转
        for (int lo = 0, hi = matrix.size() - 1; lo < hi; ++lo, --hi) {
            matrix[lo].swap(matrix[hi]);
        }

        // 对角转换
        for (int i = 0; i < matrix.size(); ++i) {
            for (int j = i + 1; j < matrix[0].size(); ++j) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
    }
};

