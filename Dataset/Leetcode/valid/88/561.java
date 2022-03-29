 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = Arrays.copyOf(nums1,m);
        int i=0,j=0,k=0;
        while(i<m&&j<n) nums1[k++] = tmp[i]>nums2[j]?nums2[j++]:tmp[i++];
        while(i<m) nums1[k++] = tmp[i++];
        while(j<n) nums1[k++] = nums2[j++];
    }
}

