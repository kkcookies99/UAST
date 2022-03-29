class Solution {
public:
    bool XXX(vector<int>& nums) {
        int step = 1;
        for (int i = 0; i < nums.size() - 1; i++) {
            step = max(step-1, nums[i]);
            if (step <= 0) return false;
        }
        return true;
    }
};

