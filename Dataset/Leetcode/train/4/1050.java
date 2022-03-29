 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int s = n1+n2;
        if(s % 2 == 1) {
            return solver(nums1, nums2, 0, 0, s/2+1);
        } else {
            return (solver(nums1, nums2, 0, 0, s/2) + solver(nums1, nums2, 0, 0, s/2+1))/2;
        }
    }
    public double solver(int[] nums1, int[] nums2, int index1, int index2, int k) {
        if (index1 >= nums1.length) {
            return nums2[index2+k-1];
        }
        if(index2 >= nums2.length) {
            return nums1[index1+k-1];
        }
        if(k == 1) {
            return Math.min(nums1[index1], nums2[index2]);
        }
        int mid1 = Math.min(index1 + (k >> 1) - 1, nums1.length-1);
        int mid2 = Math.min(index2 + (k >> 1) - 1, nums2.length-1);
        if(nums1[mid1] <= nums2[mid2]) {
            return solver(nums1, nums2, mid1+1, index2, k-(mid1-index1+1));
        } else {
            return solver(nums1, nums2, index1, mid2+1, k-(mid2-index2+1));
        }
    }
}```

