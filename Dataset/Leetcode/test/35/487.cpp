 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int low = -1, high = nums.size();
        while (low + 1 != high) {
            int mid = (low + high) >> 1;
            if (nums[mid] < target) low = mid;
            else high = mid;
        }
        return high;
    }
};

