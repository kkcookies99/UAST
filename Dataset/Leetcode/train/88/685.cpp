 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=n+m-1,j=m-1;i>=n,j>=0;i--,j--) nums1[i] = nums1[j];
        int l=n,r=0,len=0;
        while(len<n+m) {
            if(l<n+m&&r<n&&nums1[l]<=nums2[r]) nums1[len++]=nums1[l++];
            else if(l<n+m&&r<n&&nums1[l]>nums2[r]) nums1[len++]=nums2[r++];
            else if(l==n+m) nums1[len++]=nums2[r++];
            else if(r==n) nums1[len++]=nums1[l++];
        }        
    }
};

