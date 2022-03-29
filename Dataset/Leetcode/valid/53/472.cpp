 class Solution {
public:
    int XXX(vector<int>& nums) {
        int sz = nums.size();
        if (sz == 1) {
            return nums[0];
        }
        int pre_sum = nums[0]; // 之前的最大和
        int res = pre_sum;
        for (int i=1; i<sz; i++) {
            pre_sum = max(nums[i], nums[i]+pre_sum);
            if (res < pre_sum) {
                res = pre_sum;
            }
        }
        return res;
    }
};

