class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        do {
            result.emplace_back(nums);
        } while (next_permutation(nums.begin(), nums.end()));
        return result;
    }
};

