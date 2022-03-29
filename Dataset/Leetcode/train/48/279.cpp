class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int loop = n / 2;
        for (int i = 0; i < loop; ++i) {
            auto i_row = move(matrix[i]);
            matrix[i] = move(matrix[n - i - 1]);
            matrix[n - i - 1] = move(i_row);
        }

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < i; ++j)
                swap(matrix[i][j], matrix[j][i]);
    }
};

