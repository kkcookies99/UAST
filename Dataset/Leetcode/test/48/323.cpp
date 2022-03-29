class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        // 上下翻转
        for(int i = 0; i < n >> 1; ++i)
            swap(matrix[i], matrix[n - i - 1]); 
        // 镜像翻转
        for(int i = 0; i < n; ++i)
            for(int j = i; j < n; ++j)
                swap(matrix[i][j], matrix[j][i]);
        return;
    }
};

