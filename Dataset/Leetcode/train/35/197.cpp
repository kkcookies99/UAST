 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        for (int i = 0 ; i < nums.size(); i++) {
            if (nums[i] >= target)
                return i;
        }
        return nums.size();
    }
};

