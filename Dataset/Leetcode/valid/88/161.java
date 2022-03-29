 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int cur = m + n;
        while (n > 0) {
            nums1[--cur] = m != 0 && nums1[m - 1] > nums2[n - 1] ? nums1[--m] : nums2[--n];
        }
    }
}
