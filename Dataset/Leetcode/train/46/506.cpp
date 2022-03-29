 class Solution {
public:
    vector<int> nxt_permutation(vector<int> nums) {
        int n = nums.size();
        int i = n - 1;
        while(i > 0 && nums[i - 1] >= nums[i]) i --;
        if (i <= 0) reverse(nums.begin(), nums.end());
        else {
            int t = i - 1, k = t;
            while(k < n && nums[k] >= nums[t]) k ++;
            swap(nums[t], nums[k - 1]);
            reverse(nums.begin() + t + 1, nums.end());
        }

        return nums;
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        int n = nums.size();
        int times = 1;
        for (int i = 1; i <= n; i ++) times *= i;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < times; i ++) {
            auto res = nums;
            ans.push_back(res);
            nums = nxt_permutation(res);
        }
        return ans;
    }
};

