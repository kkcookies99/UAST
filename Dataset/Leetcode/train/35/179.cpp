 class Solution {
public:
    int XXX(vector<int>& nums, int target) 
    {
        int len = nums.size();
        if (nums[len - 1] < target) {
            // 如果数组最大值比target小，则返回最后一个位置id
            return len;
        }

        // 如果数组最小值比target大，则返回第一个位置id
        if (nums[0] > target) {
            return 0;
        }

        // 找到第一个大于等于target的值位置
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 2);
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
};

