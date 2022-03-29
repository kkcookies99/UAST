class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size(), c = n / 2;
        for (int i = 0; i < c; ++i)  // 从外到里一圈一圈处理，奇数图最中心为1，无需处理
        {
            for (int j = i; j < n - 1 - i; ++j)  //每一圈每条边对应4个点处理，一共[i,n-1-i)个点对
            {
                //旋转处理4个点
                swap(matrix[i][j], matrix[j][n - 1 - i]);
                swap(matrix[i][j], matrix[n - 1 - i][n - 1 - j]);
                swap(matrix[i][j], matrix[n - 1 - j][i]);
            }
        }
    }
};

