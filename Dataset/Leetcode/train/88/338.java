 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i = m-- + n-- - 1;
        while (n >= 0) {
            if (m < 0) {
                System.arraycopy(nums2, 0, nums1, 0, n + 1);
                return;
            }
            nums1[i--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
    }
}

