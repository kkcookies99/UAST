 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int len=nums1.size();
        int i=0,j=0;
        while(i<len&&j<n)
        {
            if(nums1[i]>=nums2[j])
            {
                for(int k=m-1;k>=i;k--)
                    nums1[k+1]=nums1[k];
                m++;
                nums1[i]=nums2[j];
                j++;
            }
            else
                i++;
        }
        if(i==len)
        {
            for(int k=m;k<len;k++)
            {
                nums1[k]=nums2[j++];
            }
        }
    }
};