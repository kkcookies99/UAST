 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> total(numRows, vector<int>());
        for(int i = 0; i < numRows; ++i)
        {
            total[i].resize(i + 1);
            total[i][0] = 1;
            total[i][i] = 1;
        }
        for(int i = 1; i < numRows-1; ++i)
        {
            for(int j = 1; j <= i; ++j)
            {
                total[i+1][j] = total[i][j-1] + total[i][j];
            }
        }
        
        return total;
    }
    
   
};

