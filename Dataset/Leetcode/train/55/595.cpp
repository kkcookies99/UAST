 class Solution {
public:
    bool XXX(vector<int>& nums) {
        if (nums.size() <= 1)
            return true;
        int val = nums[0], target = nums.size() - 1;
        int start = 1;
        if (val >= target)
            return true;
        while (true) {
            int new_val = -1;
            for (; start <= val; start++) {
                new_val = max(new_val, nums[start] + start);
            } 
            if (new_val >= target)
                return true;
            else if (new_val <= val)
                return false;
            start = val + 1;
            val = new_val;
        }
    }
};

