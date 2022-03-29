 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        // 1 2 2 3 | 3 4 4 5
        // [1,2 | 3,4]
        //      ^
        // [2,3 | 4,5]
        //
        if (nums1.size() <= nums2.size()) {
            return median(nums1, 0, nums1.size(), nums2);
        }
        return median(nums2, 0, nums2.size(), nums1);
    }
    
    double median(vector<int>& nums1, int l, int r, vector<int>& nums2) {
        int total = nums1.size() + nums2.size();
        int half = total / 2;
        int mid1 = 0, mid2 = 0;
        while (l < r) {
            mid1 = l + ((r - l) >> 1);
            mid2 = half - mid1;
            int left = std::max(mid1 ? nums1[mid1-1]:INT_MIN, mid2 ? nums2[mid2-1]:INT_MIN);
            int right = std::min(nums1[mid1], mid2 != nums2.size() ? nums2[mid2] : INT_MAX);
            if (right == nums1[mid1] && right < left) {
                // 左边比右边还大，向右边收缩
                l = mid1 + 1;
            } else {
                r = mid1;
            }
        }
        if (total & 1) {
            return std::min(l != nums1.size() ? nums1[l] : INT_MAX, half - l != nums2.size() ? nums2[half-l] : INT_MAX);
        } else {
            return (std::max(l ? nums1[l-1] : INT_MIN, half - l ? nums2[half-l-1] : INT_MIN)
                    + std::min(l != nums1.size() ? nums1[l]:INT_MAX, half -l != nums2.size() ? nums2[half-l]:INT_MAX)) * 0.5;
        }
        return 0;
    }
};

