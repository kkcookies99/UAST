 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int>nums3(m+n);
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(nums1[i]>=nums2[j])
            {
                nums3[k++]=nums2[j++];
            }
            else
            {
                nums3[k++]=nums1[i++];
            }
        }    
            if(i<m)
            while(i<m)
            {
                nums3[k++]=nums1[i++];
            }
       
            if(j<n)
            while(j<n)
            {
                nums3[k++]=nums2[j++];
            }
            for(int i=0;i<m+n;i++)
            nums1[i]=nums3[i];
    }
}; 




