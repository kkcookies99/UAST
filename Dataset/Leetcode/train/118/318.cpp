 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        int r = numRows;
        if(r == 0)return vector<vector<int>>();
        if(r == 1)return {{1}};
        if(r == 2)return {{1},{1,1}};
        vector<vector<int>> ans;
        ans.push_back({1});
        ans.push_back({1,1});
        for(int i=2; i<r; i++)
        {
            vector<int> v;
            v.push_back(1);
            for(int j=1; j<i; j++)
            {
                v.push_back(ans[i-1][j-1]+ans[i-1][j]);
            }
            v.push_back(1);
            ans.push_back(v);
        }
        return ans;
    }
};

