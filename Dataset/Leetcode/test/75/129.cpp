class Solution {
public:
    void XXX(vector<int>& nums) {
        int zero_idx = -1;
        int idx = 0;
        int two_idx = nums.size();

        while (idx < two_idx) {
            if (nums[idx] == 1) {
                idx++;
            } else if (nums[idx] == 0) {
                zero_idx++;
                swap(nums[idx], nums[zero_idx]);
                idx++;
            } else {
                two_idx--;
                swap(nums[idx], nums[two_idx]);
            }
        }
    }
};

