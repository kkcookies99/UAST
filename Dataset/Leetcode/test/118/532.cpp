 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        for(int i = 1; i <= numRows; ++i) {
            vector<int> dump {1};
            while(dump.size() < i) {
                int a = dump.size() < ans.back().size() ? ans.back()[dump.size()] : 0;
                dump.push_back(a+ans.back()[dump.size()-1]);
            }
            ans.push_back(std::move(dump));
        }
        return ans;
    }
};

