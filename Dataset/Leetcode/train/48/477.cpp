 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();

        int cnt = n / 2;
        for (int i = 0; i < cnt; i++) {
            for (int j = i; j < n - i - 1; j++) {
                swap4(matrix[i][j], matrix[j][n - i - 1], matrix[n - 1 - i][n - 1 - j], matrix[n - 1 - j][i]);
            }
        }
    }

    void swap4(int& a, int& b, int& c, int& d) {
        int tmp = d;
        d = c;
        c = b;
        b = a;
        a = tmp;
    }
};

