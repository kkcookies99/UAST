 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res(numRows,vector<int>());
        for(int i=0;i<numRows;i++)
        {
            res[i].resize(i+1);
            res[i][0]=1;
            res[i][i]=1;
        }
        if(numRows==0)
            return res;
        else{
            for(int i=0;i<numRows;i++)
            {
                for(int j=1;j<=i-1;j++)
                {
                    res[i][j]=res[i-1][j-1]+res[i-1][j];
                }
            }
        }
        return res;
    }
};

