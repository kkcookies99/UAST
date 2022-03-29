class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        //转置
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        //镜像
        int left = 0, right = n - 1;
        while(left < right)
        {
            for(int i = 0; i < n; i++)
            {
                swap(matrix[i][left], matrix[i][right]);
            }
            left++;
            right--;
        }
    }
};

