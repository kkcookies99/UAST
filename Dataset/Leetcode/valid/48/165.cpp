class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        if (n < 2) {
            return;
        }
        int cur = 0;
        while (cur < n / 2) {
            for (int i = 0; i < n - 2 * cur - 1; ++i) {
                int add = cur + i;
                int sub = n - cur - 1 - i;
                int tmp = matrix[cur][add];
                matrix[cur][add] = matrix[sub][cur];
                matrix[sub][cur] = matrix[n - cur - 1][sub];
                matrix[n - cur - 1][sub] = matrix[add][n - cur - 1];
                matrix[add][n - cur - 1] = tmp;
            }
            ++cur;
        }
    }
};

