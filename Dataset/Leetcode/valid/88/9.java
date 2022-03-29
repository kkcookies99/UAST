 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}

