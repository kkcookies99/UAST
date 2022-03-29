class Solution {
public:
    bool XXX(vector<int>& nums) {
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (max < i) return false;
            if (nums[i] + i > max) {
                max = nums[i] + i;
            }
        }
        return true;
    }
};

