class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>> DP(m+1, vector<int>(n+1, 0));
        DP[m][n-1] = 1; // 有技巧的初始化

        for (char row = m-1; row >= 0; --row){
            for (char col = n-1; col >= 0; --col){
                DP[row][col] = DP[row][col+1] + DP[row+1][col];
            }
        }

        return DP[0][0];

    }
};