class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        for (auto e : nums) {
            int size = res.size();
            res.push_back({e});
            for (int i = 0; i < size; ++i) {
                auto sub = res[i];
                sub.push_back(e);
                res.push_back(std::move(sub));
            }
        }
        res.push_back({});
        return res;
    }
};

