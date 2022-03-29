class Solution {
public:
    bool XXX(vector<int>& nums) {
        int can_reach = 0;
        for (int i = 0; i < nums.size(); ++i) {
            if (i > can_reach) return false;
            can_reach = max(can_reach, i + nums[i]);
        }
        return true;
    }

