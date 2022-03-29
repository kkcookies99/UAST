 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int cnt = matrix.size();
        if(cnt<2) return;
        int cols = cnt - 1;
        for (int i = 0; i < cnt / 2; ++i) {// 由外向内一层一层换
            for (int j = i; j<cols-i; ++j) { // 左上，左下、右下、右上
                int tmp                = matrix[i][j];
                matrix[i][j]           =  matrix[cols-j][i];
                matrix[cols-j][i]      = matrix[cols-i][cols-j];
                matrix[cols-i][cols-j] = matrix[j][cols-i];
                matrix[j][cols-i]      = tmp;
            }
        }
    }
};

