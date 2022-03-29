 class Solution {
public:

    double XXX(vector<int>& nums1, vector<int>& nums2) {
        // #### 双指针算法 ####
        int center = (nums1.size() + nums2.size()) / 2;
        int sum = nums1.size() + nums2.size();
        int s = 0, t = 0;
        vector<int> nums;
        while(s < nums1.size() && t < nums2.size()) {
            if(nums1[s] > nums2[t]) nums.push_back(nums2[t ++]);
            else nums.push_back(nums1[s ++]);
            if(s + t - 1 == center) {
                if(sum % 2 == 0) return double(nums[center] + nums[center - 1]) / 2.0;
                else return nums[center];
            }
        }
        while(s < nums1.size()) {
            nums.push_back(nums1[s ++]);
            if(s + t - 1 == center) {
                if(sum % 2 == 0) return double(nums[center] + nums[center - 1]) / 2.0;
                else return nums[center];
            }
        }
        while(t < nums2.size()) {
            nums.push_back(nums2[t ++]);
            if(s + t - 1 == center) {
                if(sum % 2 == 0) return double(nums[center] + nums[center - 1]) / 2.0;
                else return nums[center];
            }
        }
        return 0;
    }
};

