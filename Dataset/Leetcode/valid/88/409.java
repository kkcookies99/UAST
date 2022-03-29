 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for(int c=0;c<m;c++)nums1[nums1.length-1-c]=nums1[m-1-c];
        int a =0,i=0,j=0;
        while(i<m&&j<n&&a!=m+n)nums1[a++] = nums1[nums1.length-m+i]>nums2[j]?nums2[j++]:nums1[nums1.length-m+i++];
        while(j<n)nums1[a++]=nums2[j++];
    }
}

