 class Solution {
public:
    int XXX(std::vector<int>& nums, int val) {
        int n = nums.size() - 1;
        for (int i = 0; i <= n; i++) {
            if (nums[i] == val) {
                while (i < n && nums[n] == val)
                    n--;
                std::swap(nums[i], nums[n--]);
            }
        }
        return ++n;
    }
};

