 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res(numRows);   //定义一个numRows行的二维数组
        for(int i =0; i<numRows; i++)
        {
            res[i].resize(i+1, 1);
            for(int j=1; j<i; j++)
            {
                res[i][j] = res[i-1][j-1]+res[i-1][j]; //利用杨辉三角的形式 第n行第k个数等于 第n行第k-1和k个数的和
            }
        }
    return res; 
    }
};

