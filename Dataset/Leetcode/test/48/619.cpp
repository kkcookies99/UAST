 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int x,y,tm;
        for(int i = 0;i<n/2;i++)//一层一层的旋转，从最外层开始
        {
            x = i;
            y = i;
            for(int j = 0;j<n-i*2-1;j++)//每一层旋转的起始点个数
            {
                y = i + j;
                tm = matrix[x][y];
                matrix[x][y] = matrix[n-y-1][x];
                matrix[n-y-1][x] = matrix[n-x-1][n-y-1];
                matrix[n-x-1][n-y-1] = matrix[y][n-x-1];
                matrix[y][n-x-1] = tm;
            }
        }
    }
};

