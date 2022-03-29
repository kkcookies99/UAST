class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxPos = 0, n = nums.size();
        for(int i = 0; i < n; ++i) {
            // 如果当前元素可以走到
            if(i <= maxPos) {
                maxPos = max(maxPos, i + nums[i]);
                if(maxPos >= n - 1) return 1;
            }
        }
        return 0;
    }
};

