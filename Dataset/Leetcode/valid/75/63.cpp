class Solution {
public:
    void XXX(vector<int>& nums) {
        int left = -1, right = nums.size();
        while (right && nums[--right] == 2);
        while (left < right && !nums[++left]);
        for (int i = left; i <= right; i = max(i+1, left)) {
            if (nums[i] == 2) {
                swap(nums[right], nums[i]);
                while (right > i && nums[--right] == 2);
            }
            if (!nums[i]) {
                swap(nums[left], nums[i]);
                while (left < right && !nums[++left]);
            }
        }
    }
};

