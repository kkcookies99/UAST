class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        rt2ld(matrix);
        l2r(matrix);
    }

    void rt2ld(vector<vector<int>>& matrix) {
        for (int i = 0; i < matrix.size() - 1; i++) {
            for (int j = i + 1; j < matrix[0].size(); j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
    }

    void l2r(vector<vector<int>>& matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix[0].size() / 2; j++) {
                swap(matrix[i][j], matrix[i][matrix[0].size() - j - 1]);
            }
        }
    }
};

