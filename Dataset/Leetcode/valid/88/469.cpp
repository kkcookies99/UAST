 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int index = m + n;
        while (--index >= 0 && n >= 1)
        {
            if (m == 0) nums1[index] = nums2[--n];
            else
                if (nums2[n - 1] > nums1[m - 1]) nums1[index] = nums2[--n];
                else nums1[index] = nums1[--m];
        }
    }
};

