class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size() == 1)
            return true;
        int n = nums.size();
        int dst = n - 1;
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] >= dst - i)
                dst = i;
        }
        return (dst == 0);
    }
};

