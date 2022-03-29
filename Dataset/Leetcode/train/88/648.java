 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int len=nums1.length;
        int i,j,k;
        for(i=m-1,j=n-1,k=len-1;k>=0&i>=0&j>=0;k--){
            if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else
            {
                nums1[k]=nums2[j];
                j--;
            }
        }
        if(j>=0){
            for(;k>=0&j>=0;k--,j--)
            {
                nums1[k]=nums2[j];
            }
        }
    }
}

