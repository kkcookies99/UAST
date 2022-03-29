 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        // 最简单的想法：合并数组，再排序，再取中间值
        vector<int> nums;
        for(int i = 0; i < nums1.size(); i ++) nums.push_back(nums1[i]);
        for(int i = 0; i < nums2.size(); i ++) nums.push_back(nums2[i]);
        sort(nums.begin(), nums.end());
        if(nums.size() % 2 == 0) return double(nums[nums.size() / 2] + nums[nums.size() / 2 - 1]) / 2.0;
        return double(nums[nums.size() / 2]);
    }
};


