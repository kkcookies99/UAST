 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int max_dis = 0;
        for (int i = 0; i < nums.size(); ++i) {
            if (max_dis < i) return false;
            max_dis = max(max_dis, i + nums[i]);
        }
        return true;
    }
};

