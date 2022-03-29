 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < n + m; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }
}

