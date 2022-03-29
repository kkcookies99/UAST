 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        res.push_back({1});
        for(int i=1;i<numRows;++i)
        {
            vector<int> tmp(i+1);
            for(int j=0;j<=i;++j)
            {
                if(j==0||j==i)tmp[j]=1;
                else
                {
                    tmp[j]=res[i-1][j-1]+res[i-1][j];
                }
            }
            res.push_back(tmp);
        }
        return res;
    }
};

