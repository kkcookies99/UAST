 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {

        vector<vector<int>> res;
        res.push_back({1});
        for (int i = 1; i < numRows; i ++ )
        {
            vector<int> tmp;
            for (int j = 0; j <= i; j ++ )
            {
                if (j == 0 || j == i)   tmp.push_back(1);
                else    tmp.push_back(res[i - 1][j - 1] + res[i - 1][j]);
            }
            res.push_back(tmp);
        }
        return res;
    }
};

