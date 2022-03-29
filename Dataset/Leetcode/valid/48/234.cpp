class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int size = matrix.size();
        for (int j = (size >> 1) - 1; j >= 0; --j) {
            for (int i = size - j - 2; i >= j; --i) {
                int y = j, x = i;
                int reserve = matrix[y][x];
                for (int k = 0; k != 3; ++k) {
                    int ny = size - 1 - x;
                    int nx = y;
                    matrix[y][x] = matrix[ny][nx];
                    y = ny;
                    x = nx;
                }
                matrix[y][x] = reserve;
            }
        }
    }
};

