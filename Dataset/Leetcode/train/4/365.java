 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        return ((findKth(nums1,nums2,0,0,(len1+len2+1)/2))+(findKth(nums1,nums2,0,0,(len1+len2)/2+1)))/2.0;
    }
    public double findKth(int[] nums1, int[] nums2, int start1, int start2, int k){
        int len1 = nums1.length, len2 = nums2.length;
        if(len1 <= start1){
            return nums2[start2+k-1];
        }
        if(len2 <= start2){
            return nums1[start1+k-1];
        }
        if(k == 1){
            return Math.min(nums1[start1],nums2[start2]);
        }
        int v1 = Integer.MAX_VALUE, v2 = Integer.MAX_VALUE;
        if(start1 + k/2 <= len1){
            v1 = nums1[start1 + k/2 - 1];
        }
        if(start2 + k/2 <= len2){
            v2 = nums2[start2 + k/2 - 1];
        }
        if(v1 < v2){
            return findKth(nums1, nums2, start1+k/2, start2, k-k/2);
        }
        return findKth(nums1,nums2,start1,start2+k/2,k-k/2);
    }
}

