 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m];
        for (int i = 0; i < m; ++i) {
            nums[i] = nums1[i];
        }

        int i = 0, j = 0, k;
        for (k = 0; k < m + n; ++k) {
            if (!(i < m && j < n)) break;
            if (nums[i] < nums2[j]) {
                nums1[k] = nums[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            nums1[k] = nums[i];
            k++;
            i++;
        }
        while (j < n) {
            nums1[k] = nums2[j];
            k++;
            j++;
        }
    }
}

