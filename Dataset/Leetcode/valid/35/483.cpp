 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int l = 0, r = nums.size() - 1;
        int mid;
        while(l <= r){
            mid = (l + r) / 2;
            if(target < nums[mid]){
                r = mid - 1;
            }else if(target > nums[mid]){
                l = mid + 1;
            }else{
                return mid;
            }
        }
        return nums[mid] > target ? mid : mid + 1;
    }
};

