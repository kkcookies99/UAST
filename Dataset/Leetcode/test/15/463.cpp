 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if (nums.size() < 3) return {};
        vector<vector<int>> ans;
        unordered_map<int, int> hash;
        sort(nums.begin(), nums.end());
        for (auto it = nums.end() - 1; *it >= 0; --it) {
            hash[*it]++;
            if (it == nums.begin()) {
                if (*it) return {};
                break;
            }
        }
        for (auto i = nums.begin(); i < nums.end() - 2; ++i) {
            if (*i >= 0) {
                if (!*(i + 1) && !*(i + 2)) {
                    ans.push_back({0, 0, 0});
                }
                break;
            }
            if (i > nums.begin() && *(i - 1) == *i) continue;
            for (auto j = i + 1; j < nums.end() - 1; ++j) {
                if (j > i + 1 && *j == *(j - 1)) continue;
                const int temp = -*i - *j;
                if (temp < 0 || temp < *j) break;
                auto it = hash.find(temp);
                if (it != hash.end() && it->second > (temp == *j)) {
                    ans.push_back({*i, *j, temp});
                }
            }
        }
        return ans;
    }
};

