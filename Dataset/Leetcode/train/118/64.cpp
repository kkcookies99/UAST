 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        vector<int> row1 (1,1);
        res.push_back(row1);
        for(int i=2; i<=numRows; i++)
        {
            vector<int> row(i, 1);
            int lr = res.size() - 1;
            int lrs = res[lr].size();
            for(int j=1; j<=i-2&&lrs==i-1; j++)
            {
                row[j] = res[lr][j-1] + res[lr][j];
            }
            res.push_back(row);
        }
        return res;
    }
};

