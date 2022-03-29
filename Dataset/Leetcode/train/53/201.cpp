class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum = nums[0];
        int res = sum;

        for (int i = 1; i < nums.size(); i++) {
            sum = max(nums[i], nums[i] + sum);
            res = max(res, sum);
        }

        return res;
    }
};

