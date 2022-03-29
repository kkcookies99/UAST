 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        if (matrix.size() == 1) {
            return;
        }

        for (int i = 0; i < matrix.size() / 2; ++i) {
            for (int j = 0; j < matrix.at(0).size(); ++j) {
                swap(matrix.at(i).at(j), matrix.at(matrix.size() - i - 1).at(j));
            }
        }

        for (int i = 0; i < matrix.size(); ++i) {
            for (int j = 0; j < i; ++j) {
                swap(matrix.at(i).at(j), matrix.at(j).at(i));
            }
        }
    }
};

