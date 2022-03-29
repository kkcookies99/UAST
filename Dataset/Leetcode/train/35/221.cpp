 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        if(nums.size() == 0 || nums[0] > target) return 0;
        if(nums.back() < target) return nums.size();
        int l = 0, r = nums.size() - 1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                if(mid == nums.size() - 1 || nums[mid + 1] > target){
                    return mid + 1;
                }
                l = mid + 1;
            }else{
                if(mid == 0 || nums[mid - 1] < target){
                    return mid;
                }
                r = mid - 1;
            }
        }
        if(nums[r] < target) return r+1;
        else if(nums[r] == target) return r;
        else return r-1;
    }
};

