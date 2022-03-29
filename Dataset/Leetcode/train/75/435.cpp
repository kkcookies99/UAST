 class Solution {
public:
    void XXX(vector<int>& nums) {
        int n = nums.size(), zero_r = -1, two_l = n;
        for (int i = 0; i < two_l; ++i) {
            while (nums[i] != 1 && zero_r < i && i < two_l) {
                if (nums[i] == 0) {
                    swap(nums[i], nums[++zero_r]);
                } else {
                    swap(nums[i], nums[--two_l]);
                }
            }
        } 
    }
};

