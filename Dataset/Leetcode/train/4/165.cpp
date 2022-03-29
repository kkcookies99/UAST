 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size(), n = nums2.size();
        vector<int> num(m+n);

        int l = 0, r = 0;
        for (int i = 0; i < m+n; ++i) {
            if (l == m)
                num[i] = nums2[r++];
            else if (r == n)
                num[i] = nums1[l++];
            else if (nums1[l] < nums2[r])
                num[i] = nums1[l++];
            else
                num[i] = nums2[r++];
        }

        if ((m+n)%2 == 0)
            return (double)(num[(m+n)/2] + num[(m+n)/2 - 1])/2;
        else
            return num[(m+n)/2];
    }
};

