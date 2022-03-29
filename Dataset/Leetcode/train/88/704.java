 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1, p1 = m - 1, p2 = n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}

