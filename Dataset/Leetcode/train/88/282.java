 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = Arrays.copyOf(nums1, m);
        int i = 0, j = 0, k = 0;
        while ( i < m && j < n ) {
            if ( nums1_copy[i] <= nums2[j] ) {
                nums1[k++] = nums1_copy[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }
        while ( i < m ) {
            nums1[k++] = nums1_copy[i++];
        }
        while ( j < n ) {
            nums1[k++] = nums2[j++];
        }
    }
}

