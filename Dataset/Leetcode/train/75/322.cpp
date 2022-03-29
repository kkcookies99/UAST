class Solution {
public:
    void XXX(vector<int>& nums) {
        int n = nums.size();
        if (n < 2) {
            return;
        }
        int l = 0, r = n - 1;
        for (int i = 0; i <= r; ++i) {
            if (nums[i] == 0) {
                swap(nums[i], nums[l++]);
            } else if (nums[i] == 2) {
                swap(nums[i], nums[r--]);
                --i;
            }
        }
    }
};

