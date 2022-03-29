class Solution {
public:
    bool XXX(vector<int>& nums) {
        int len = nums.size();
        int far = 0;

        for (int i=0; i<len-1; i++) {
            far = max(nums[i]+i, far);
            if (far == i) return false;
        }

        return true;
    }
};

