 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i = m-- + n--; m >= 0 && n >= 0;)
            nums1[--i] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        for(int i = 0; i <= n; ++i) nums1[i] = nums2[i];
    }
};

