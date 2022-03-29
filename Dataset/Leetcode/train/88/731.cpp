 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> tmp=nums1;
        int i=0,j=0,k=0;
        while(i<m&&j<n)
            nums1[k++]=tmp[i]<=nums2[j]? tmp[i++]:nums2[j++];
        while(i<m)
            nums1[k++]=tmp[i++];
        while(j<n)
            nums1[k++]=nums2[j++];
    }
};

