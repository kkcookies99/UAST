 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int> nums(nums1);
        nums.insert(nums.end(), nums2.begin(), nums2.end());
        sort(nums.begin(), nums.end());
        int mid = nums.size() / 2;
        if (nums.size() % 2 == 0) {
            return (double)(nums[mid] + nums[mid - 1]) / 2.0;
        }
        else {
            return (double)nums[mid];
        }
    }
};

