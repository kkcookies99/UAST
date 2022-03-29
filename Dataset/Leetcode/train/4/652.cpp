 class Solution {
public:
    // 二分法
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size();
        int n = nums2.size();
        // 不管是奇数偶数都适用，用于取中位数
        int left = (m+n+1) / 2;
        int right = (m+n+2) / 2;
        return (findKthNum(nums1, 0, nums2, 0, left) + findKthNum(nums1, 0, nums2, 0, right)) / 2.0;
    }
    // 取两个数组中第K大的数
    int findKthNum(vector<int> &nums1, int i, vector<int> &nums2, int j, int k) {
        // 首先要判断下标是否合理
        if (i >= nums1.size()) {
            return nums2[j+k-1];
        }
        if (j >= nums2.size()) {
            return nums1[i+k-1];
        }
        // 若k==1，说明要取两个数组中的第一个小的数
        if (k == 1) {
            return nums1[i]>nums2[j] ? nums2[j] : nums1[i];
        }
        // 分别取出两个数组的k/2个数，当然要保证不越界
        int minVal1 = i+k/2-1 < nums1.size() ? nums1[i+k/2-1] : INT_MAX;
        int minVal2 = j+k/2-1 < nums2.size() ? nums2[j+k/2-1] : INT_MAX;
        if (minVal1 < minVal2) {
            return findKthNum(nums1, i+k/2, nums2, j, k-k/2);
        } else {
            return findKthNum(nums1, i, nums2, j+k/2, k-k/2);
        }
    }
};

