class Solution {
public:
    int XXX(vector<int>& nums) {
        int ans = nums[0], _min = nums[0];
        for (int i = 1; i < nums.size(); i++)
        {
            nums[i] += nums[i - 1];
        }
        for (int i = 1; i < nums.size(); i++)
        {
            ans = max(ans, nums[i] - _min);
            _min = min(_min, nums[i]);

        }
        return ans;

    }
};

