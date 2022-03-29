 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int []p=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m&&j<n)
            p[k++]=nums1[i]<nums2[j]?nums1[i++]:nums2[j++];
        while(i<m)
            p[k++]=nums1[i++];
        while(j<n)
            p[k++]=nums2[j++];
        System.arraycopy(p,0,nums1,0,p.length);
    }
}

