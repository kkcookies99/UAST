 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int len=nums1.size();
        for(int i=m;i<len;i++)nums1[i]=nums2[i-m];
        sort(nums1.begin(),nums1.end());
    }
};

