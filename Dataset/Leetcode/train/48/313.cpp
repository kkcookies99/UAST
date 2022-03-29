class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        auto len = matrix.size();
        reverse(matrix.begin(), matrix.end());
        for (auto i = 0; i < len; ++i) {
            for (auto j = 0; j < i; ++j) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
    }
};

