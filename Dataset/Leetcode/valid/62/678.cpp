class Solution {
public:
    int XXX(int m, int n) 
    {
        if (m == 0 || n == 0) return 0;
        if (m == 1 || n == 1) return 1;
        // dp_paths[i][j]表示从[0,0]走到[i,j]处存在的路径数
        vector<vector<int>> dp_paths(m, vector<int>(n, 1)); 
        
        for(int i=1; i<m; ++i)
        {
            for(int j=1; j<n; ++j)
            {
                dp_paths[i][j] = dp_paths[i-1][j] + dp_paths[i][j-1];
            }
        }
        return dp_paths[m-1][n-1]; 
    }
};

