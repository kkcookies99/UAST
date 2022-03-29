 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int left=0, right=nums.size()-1, mid;
        while(left < right) {
            mid = (left + right) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) left=mid+1;
            else right=mid-1;
        }
        return nums[left] < target? left+1 : left;
    }
};

