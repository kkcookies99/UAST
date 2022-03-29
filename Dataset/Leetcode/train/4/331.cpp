 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size(), m = nums2.size();
        if(!n && !m) return 0.0;
        int pos = (n + m - 1) >> 1;
        int l = max(0, pos - m), r = min(pos, n);
        while(l < r){
            int mid = (l + r) >> 1;
            if(nums1[mid] < nums2[pos - mid - 1])
                l = mid + 1;
            else r = mid;
        }
        if((n + m) & 1) {
            if(l >= n) return nums2[pos - l];
            if(pos - l >= m) return nums1[l];
            if(nums1[l] < nums2[pos - l]) return nums1[l];
            return nums2[pos - l];
        }else{
            if(l >= n) return 0.5 * (nums2[pos - l] + nums2[pos - l + 1]);
            if(pos - l >= m) return 0.5 * (nums1[l] + nums1[l + 1]);
            if(pos - l + 1 < m && nums1[l] > nums2[pos - l + 1])
                return 0.5 * (nums2[pos - l] + nums2[pos - l + 1]);
            else if(l + 1 < n && nums2[pos - l] > nums1[l + 1])
                return 0.5 * (nums1[l] + nums1[l + 1]);
            else return 0.5 * (nums1[l] + nums2[pos - l]);
        }
    }
};

