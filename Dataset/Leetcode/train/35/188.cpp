 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int l = -1,r = nums.size() - 1,mid;
        while(l < r){
            mid = (l + r + 1)/2;
            if(nums[mid] == target)return mid;
            if(nums[mid] < target )l = mid;
            else r = mid-1;
        }
        return l + 1;
    }
};