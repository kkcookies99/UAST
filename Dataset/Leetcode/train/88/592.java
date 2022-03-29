 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] sortedArray = new int[m+n];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < m || j < n) {
            if (i == m) {
                sortedArray[index++] = nums2[j++];
            } else if (j == n) {
                sortedArray[index++] = nums1[i++];
            } else if (nums1[i] <= nums2[j]) {
                sortedArray[index++] = nums1[i++];
            } else {
                sortedArray[index++] = nums2[j++];
            }
        }
        for (int k = 0; k < nums1.length; k++) {
            nums1[k] = sortedArray[k];
        }
    }
}

