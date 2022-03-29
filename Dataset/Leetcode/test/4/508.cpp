 class Solution {
public:

    int findk(vector<int>& nums1 , vector<int>& nums2 , int k) {
        int m = nums1.size() , n = nums2.size() ;
        if (m == 0) {
            return nums2[k - 1] ;
        }
        if (nums1[0] >= nums2[n - 1]) {
            if (n >= k)
                return nums2[k - 1] ;
            return nums1[k - n - 1] ;
        }
        if (nums2[0] >= nums1[m - 1]) {
            if (m == k) {
                return nums1[m - 1] ;
            } else return nums2[k - m - 1] ;
        }
        
        //找最大的x,使得nums1[x] <= nums2[k - (x + 1)]
        int l = -1 , r = m - 1 ;
        while (l < r) {
            int mid = (l + r + 1) >> 1 ;
            if ((k - (mid + 1) >= n) || (nums1[mid] <= nums2[k - (mid + 1)])) {
                l = mid ;
            } else {
                r = mid - 1 ;
            }
        }
        if (l == -1)
            return nums2[k - 1] ;
        int down = k - (l + 1) - 1 ;
        return max(nums1[l] , nums2[down]) ;
    }

    double XXX(vector<int>& nums1, vector<int>& nums2) {
        if (nums1.size() > nums2.size()) {
            swap(nums1 , nums2) ;
        }
        int m = nums1.size() , n = nums2.size() ;
        if ((n + m) % 2 == 0) {
            return (findk(nums1 , nums2 , (n + m) / 2) + findk(nums1 , nums2 , (n + m) / 2 + 1)) * 0.5 ;
        } else {
            return findk(nums1 , nums2 , (n + m) / 2 + 1) ;
        }
    }
};

