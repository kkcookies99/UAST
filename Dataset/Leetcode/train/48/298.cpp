class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        int left = 0;
        int right = n - 1;
        while (left < right) {
            for (int i = 0; i < n; i++) {
                swap(matrix[i][left], matrix[i][right]);
            }
            left++;
            right--;
        }
    }
};

