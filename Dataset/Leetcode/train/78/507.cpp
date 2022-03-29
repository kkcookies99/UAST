 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans = {{}};
        for (const auto &i : nums) {
            auto p = ans;
            for (auto &j : p) {
                auto t = j;
                t.push_back(i);
                ans.push_back(t);
            }
        }
        return ans;
    }
};

