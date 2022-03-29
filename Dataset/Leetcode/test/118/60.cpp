 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        ans.push_back({1});
        for(int i = 1; i<numRows; i++){
            vector<int> temp = ans[ans.size()-1];
            vector<int> curr(i+1,1);
            for(int j = 1; j< i; j++){
                curr[j] = temp[j] + temp[j-1];
            }
            ans.push_back(curr);
        }

        return ans;
    }
};

