class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bool flag = false;
                if (matrix[i][j] < 0) flag = true;
                if (flag) {
                    matrix[i][j] = -matrix[i][j];
                    matrix[i][j] |= 0x00000800;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix[i][j] + ((matrix[n - j - 1][i] & 0x00000fff) << 12);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix[i][j] >> 12;
                if (matrix[i][j] & 0x00000800) {
                    matrix[i][j] = -(matrix[i][j] & 0x000007ff);
                }
            }
        }
        return ;
    }
};

