 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if (nums.size() < 3) return {};
        vector<vector<int>> ans;
        int vmin = nums[0], vmax = nums[0];
        for (auto &i: nums) {
            vmin = min(vmin, i);
            vmax = max(vmax, i);
        }
        if (vmax < 0 || vmin > 0) return {};
        vector<int> hash(vmax - vmin + 1);
        for (auto &i: nums) {
            hash[i - vmin]++;
        }
        vector<int> v;
        for (int i = 0; i < vmax - vmin + 1 && 2 * vmin + i<= 0; i++) {
            if (hash[i]) v.push_back(i + vmin);
        }
        if (v.empty()) return {};
        if (hash[-vmin] == 2) hash[-vmin] = 1;
        for (auto first = v.begin(); first < v.end(); ++first) {
            if (*first > 0) break;
            for (auto mid = hash[*first - vmin] > 1 ? first : first + 1; mid < v.end(); ++mid) {
                const int target = -*first-*mid;
                if (target < *mid) break;
                if (target > vmax) continue;
                if (hash[target - vmin] > int(target == *mid)) {
                    ans.push_back({*first, *mid, target});
                }
            }
        }
        return ans;
    }
};

