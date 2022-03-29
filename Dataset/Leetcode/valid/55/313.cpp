class Solution {
public:
    // 贪心：遍历数组，更新能到达的最大下标位置
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        int len = 0; // 记录能到达的最大下标位置

        for (int i = 0; i < n; i ++) {
            if (i <= len) {
                len = max(i + nums[i], len);
            }

            if (len >= n - 1) {
                return true;
            }
        }

        return false;
    }
};

