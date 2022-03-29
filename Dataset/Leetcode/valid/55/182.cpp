class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        int maxIdx = nums[0], i;
        for (i = 0; maxIdx + 1 < n && i <= maxIdx; ++i) {
            maxIdx = max(maxIdx, i + nums[i]);
        }
        return maxIdx >= n - 1;
    }
};

