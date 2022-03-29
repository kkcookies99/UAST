 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int j=0,k=0;
        vector<int> nums3(nums1);
        for(int i=0;i<m+n;i++)
        {
            if(j>=m)nums1[i]=nums2[k++];
           else if(k>=n)nums1[i]=nums3[j++];
           else
           nums1[i]= nums3[j]<nums2[k]?nums3[j++]:nums2[k++];
        }

    }
};

