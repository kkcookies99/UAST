 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for( int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; k--){
            nums1[k] = i < 0 || nums2[j] > nums1[i] ? nums2[j--] : nums1[i--];
        }
    }
}

