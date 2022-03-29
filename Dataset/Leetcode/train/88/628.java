 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = nums2.length - 1;
        int index = nums1.length - 1;
        while (j >= 0 || i >= 0) {
            if (i < 0) {
                nums1[index] = nums2[j--];
            } else if (j < 0) {
                nums1[index] = nums1[i--];
            } else if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i--];
            } else {
                nums1[index] = nums2[j--];
            }
            index--;
        }
    }
}

