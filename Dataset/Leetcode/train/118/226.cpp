 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector <vector <int> > dp(numRows); 
        for(int i = 0; i < numRows; i++)
        {
            vector <int> Rows(i+1,1);
            for(int j = 0; j < (i+1); j++)
            {
                if(j == 0 | j == i)
                    Rows[j] = 1;
                else
                    Rows[j] = dp[i-1][j-1]+dp[i-1][j];
            }
            dp[i] = Rows;   
        }
        
        return dp;
    }
};

