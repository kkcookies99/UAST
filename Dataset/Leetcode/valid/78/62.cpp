class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int len = nums.size();
        vector<vector<int>> result;
        vector<int> tmp;
        for (int k = 0; k <= len; k++) {
            func(result, tmp, nums, len, k, 0);
        }
        return result;
    }
    void func(vector<vector<int>>& result, vector<int>& tmp, vector<int>& nums, int n, int k, int i) {
        if (k == 0) {
            result.push_back(tmp);
        }
        for (int j = i; j < n; j++) {
            tmp.push_back(nums[j]);
            func(result, tmp, nums, n, k - 1, j + 1);
            tmp.pop_back();
        }
    }
};

