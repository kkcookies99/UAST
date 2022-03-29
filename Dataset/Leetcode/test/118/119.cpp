 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int> > ans;
        for(int rowId=0; rowId<numRows; ++rowId)
        {
            vector<int> row;
            for(int colId=0; colId<rowId+1; ++colId)
                row.push_back(1);
            for(int id=1; id<row.size()-1; ++id)
                row[id] = ans[rowId-1][id-1] + ans[rowId-1][id];
            ans.push_back(row);
        }
        return ans;
    }
};

