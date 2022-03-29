 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        if (nums1.size() > nums2.size()) nums1.swap(nums2);
        int n = nums1.size(), m = nums2.size();
        int left = 0, right = n;
        int count = (m + n + 1) / 2;
        while (left < right) {
            int mid1 = (left + right + 1) / 2;
            int mid2 = count - mid1;
            if (nums1[mid1 - 1] > nums2[mid2]) {
                right = mid1 - 1;
            } else {
                left = mid1;
            }
        }
        int mid1 = left;
        int mid2 = count - mid1;
        int maxL = max(mid1 ? nums1[mid1 - 1] : INT_MIN, mid2 ? nums2[mid2 - 1] : INT_MIN);
        int minR = min(mid1 == n ? INT_MAX : nums1[mid1], mid2 == m ? INT_MAX : nums2[mid2]);
        return (n + m) % 2 ? maxL : (maxL + minR) / 2.0;
    }
};

