 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size();
        int n = nums2.size();
        if (m > n) return XXX(nums2, nums1);
        int l = 0; 
        int r = m + 1;
        int left = 0;
        int right = 0;
        while(l < r) {
            int i = l + (r - l) / 2;
            int j = (m + n + 1) / 2 - i;
            int a0 = i == 0 ? -0x3f3f3f3f : nums1[i - 1];
            int a1 = i == m ? 0x3f3f3f3f: nums1[i];
            int b0 = j == 0 ? -0x3f3f3f3f : nums2[j - 1];
            int b1 = j == n ? 0x3f3f3f3f: nums2[j];
            if (a0 <= b1) {
                left = max(a0, b0);
                right = min(a1, b1);
                l = i + 1;
            }
            else {
                r = i;
            }
        }
        if ((m + n) & 1) return left;
        else return (left + right) / 2.0;

    }
};

