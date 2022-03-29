 class Solution {
public:
    vector <vector<int>> XXX(vector<int> &nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector <vector<int>> ans;
        for (int i = 0; i < n - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = n - 1;
            while (j < k) {
                while (j < k && nums[i] + nums[j] + nums[k] > 0) --k;
                if (j < k && nums[i] + nums[j] + nums[k] == 0) ans.push_back({nums[i], nums[j], nums[k]});
                if (nums[j] == nums[k]) break;
                while (nums[++j] == nums[j - 1]);
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


