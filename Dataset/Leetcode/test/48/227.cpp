class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for(int l = 0, r = n - 1; l < r; l ++, r --) {
            for(int i = 0; i < r - l; i ++) {
                int t = matrix[l][l + i];
                matrix[l][l + i] = matrix[r - i][l];
                matrix[r - i][l] = matrix[r][r - i];
                matrix[r][r - i] = matrix[l + i][r];
                matrix[l + i][r] = t;
            }
        }
    }
};

