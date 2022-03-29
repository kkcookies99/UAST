 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        
        vector<vector<int>> ans;
        for(int i = 0; i<numRows; ++i)
        {
            vector<int> line(i+1, 1);
            for(int j = 1; j<i; ++j)
                line[j] = ans.back()[j-1] + ans.back()[j];

            ans.push_back(line);
        }
        return ans;
    }
};

