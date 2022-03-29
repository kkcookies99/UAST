 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        nums1.reserve(m+n);
        for(int i = m; i < nums1.size(); ++i)
        {
            nums1[i] = nums2[n-1];
            --n;
        }
        sort(nums1.begin(),nums1.end());
    }
};

