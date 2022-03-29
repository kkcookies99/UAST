 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for (int c = m + n - 1; n > 0 && c >= m; --c)
        {
            if (m == 0 || nums1[m - 1] <= nums2[n - 1])
            {
                nums1[c] = nums2[n - 1];
                --n;
            }
            else
            {
                nums1[c] = nums1[m - 1];
                --m;
            }
        }
    }
};

