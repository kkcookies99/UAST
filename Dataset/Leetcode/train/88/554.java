 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int j1 = m - 1;
        int j2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (j2 < 0 || (j1 >= 0 && nums1[j1] > nums2[j2])) {
                nums1[i] = nums1[j1--];
            } else {
                nums1[i] = nums2[j2--];
            }
        }
    }
}

