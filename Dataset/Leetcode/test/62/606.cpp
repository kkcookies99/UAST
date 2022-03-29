class Solution {
public:
    //动态规划
    int XXX(int m, int n)
    {
        if (m == 1 && n == 1)
            return 1;
        vector<vector<int>> path(m, vector<int>(n, 0));
        //最右边一列和最下面一行的路径个数都只能为1
        for (int i = 0; i < m; i++)
            path[i][n - 1] = 1;
        for (int i = 0; i < n; i++)
            path[m - 1][i] = 1;
        for (int i = m - 2; i >= 0; i--)
        {
            for (int j = n - 2; j >= 0; j--)
            {
                path[i][j] = path[i + 1][j] + path[i][j + 1];
            }
        }
        return path[0][0];
    }
};

