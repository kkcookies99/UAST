 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        vector<int> first;
        first.emplace_back(1);
        ans.emplace_back(first);
        if(numRows == 1) {
            return ans;
        }
        vector<int> second= {1,1};
        ans.emplace_back(second);
        if(numRows == 2) {
            return ans;
        }
        vector<int> pre = second;
        for(auto i = 3; i <= numRows; ++i) {
            vector<int> currentVec;
            currentVec.emplace_back(1);
            for(auto j = 1; j <= i - 2; ++j) {
                currentVec.emplace_back(pre[j - 1] + pre[j]);
            }
            currentVec.emplace_back(1);
            ans.emplace_back(currentVec);
            pre = currentVec;
        }
        return ans;
    }
};

