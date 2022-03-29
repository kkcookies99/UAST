class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> results;
        results.reserve(1 << nums.size());

        sort(nums.begin(), nums.end());
        results.push_back({});
        for (int i = 0; i < nums.size(); i++) {
            results.push_back({ nums[i] });
        }

        for (int i = 1; i < nums.size(); i++) {
            for (int j = results.size() - 1; results[j].size() == i; j--) {
                auto result = results[j];
                int e = result.back();

                for (int k = nums.size() - 1; nums[k] > e; k--) {
                    if (result.size() == i) {
                        result.push_back(nums[k]);
                    } else {
                        result.back() = nums[k];
                    }
                    results.push_back(result);
                }
            }
        }

        return results;
    }
};

