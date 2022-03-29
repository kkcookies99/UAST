 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        if (nums.size() < 3) return ans;
        int i, j, k, a, b, c;
        sort(nums.begin(), nums.end(), less<int>());
        for (i = 0; i < nums.size() - 2; i++) {
            a = nums[i];
            if (a > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            j = i + 1;
            k = nums.size() - 1;
            while (j < k) {
                b = nums[j];
                c = nums[k];
                if (a + b + c == 0) {
                    ans.push_back(vector<int> {a, b, c});
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (a + b + c > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return ans;
    }
};

