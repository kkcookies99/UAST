 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int left = 0, right = nums.size() - 1, mid;
        while(left < right) {
            mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid;
            else left = mid + 1;
        }
        if(nums[left] >= target)
            return left;
        else return left+1;
    }
};

