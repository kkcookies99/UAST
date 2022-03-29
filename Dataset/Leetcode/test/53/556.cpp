 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = nums.size();
        int sum = 0;
        int res = INT_MIN;
        for (int i = 0; i < n; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            res = max(sum, res);
        }
        return res;
    }
};

