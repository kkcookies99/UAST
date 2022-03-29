 class Solution {
    public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        if (nums.size() < 3)
            return res;
        sort(nums.begin(), nums.end());
        for (auto i = nums.begin(); i != nums.end() - 2;) {
            for (auto j = i + 1; j != nums.end() - 1;) {
                for (auto k = j + 1; k != nums.end();) {
                    if (*i + *j + *k == 0)
                        res.push_back({*i, *j, *k});
                    while (++k != nums.end() && *k == *(k - 1));
                }
                while (++j != nums.end() - 1 && *j == *(j - 1));
            }
            while (++i != nums.end() - 2 && *i == *(i - 1));
        }
        return res;
    }
};

