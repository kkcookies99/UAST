 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        // int n = nums.size();
        // int l = 0, r = n - 1;

        // while(l <= r) {
        //     int mid = l + (r - l) / 2;
        //     if(nums[mid] == target) {
        //         return mid;
        //     }

        //     if(nums[mid] > target) {
        //         r = mid - 1;
        //     }else{
        //         l = mid + 1;
        //     }
        // }

        return lower_bound(nums.begin(), nums.end(), target) - nums.begin();
    }
};

