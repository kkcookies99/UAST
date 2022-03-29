 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int headPos = 0, footPos = nums.size() - 1;
        while (headPos <= footPos) {
            int midPos = headPos + ((footPos - headPos) >> 2);
            if (target == nums[midPos]) {
                return midPos;
            } else if (target > nums[midPos]) {
                headPos = midPos + 1;
            } else if (target < nums[midPos]) {
                footPos = midPos - 1;
            }
        }
        return headPos;
    }
};

