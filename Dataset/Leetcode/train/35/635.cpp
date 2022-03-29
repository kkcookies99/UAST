 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        nums.push_back(INT_MAX);
        int left = 0, right = nums.size() - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target) right = mid;
            else if(nums[mid] < target) left = mid + 1;
            else return mid;
        }
        return left;
    }
};

