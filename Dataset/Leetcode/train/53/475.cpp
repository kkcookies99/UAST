 class Solution {
public:
    int XXX(vector<int>& nums) {
        int ans = nums[0];
        for(int i=1; i<nums.size(); ++i) {
            if(nums[i] + nums[i-1] > 0 && nums[i-1] > 0) nums[i] = nums[i] + nums[i-1];
            ans = ans > nums[i] ? ans : nums[i];
        }
        return ans;
    }
};

