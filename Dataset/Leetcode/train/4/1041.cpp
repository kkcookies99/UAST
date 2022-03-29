 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size() + nums2.size();
        if (n & 1){
            return findKthElm(nums1, nums2, (n >> 1) + 1);
        } else {
            return (findKthElm(nums1, nums2, n >> 1) + findKthElm(nums1, nums2, (n >> 1) + 1)) / 2.0;
        }
    }

    int findKthElm(vector<int>& nums1, vector<int>& nums2, int k){
        int left = max(0, int(k - nums2.size())), right = min(k, int(nums1.size()));
        while (left < right){
            int mid = left + (right - left) / 2;
            if (nums2[k - mid - 1] > nums1[mid])    left = mid + 1;
            else right = mid;
        }

        int num1leftMax = left == 0 ? INT_MIN : nums1[left - 1];
        int nums2leftMax = left == k ? INT_MIN  : nums2[k - left - 1];
        return max(num1leftMax, nums2leftMax);
    }

    
};


