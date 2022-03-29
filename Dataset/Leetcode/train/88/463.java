 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || nums2.length == 0) {
            return;
        }
         if (m <= 0) {
            nums1 = new int[nums2.length];
            m = nums1.length;
        }
        int numsLength = nums1.length - 1;
        while (n > 0) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[numsLength--] = nums2[n - 1];
                n--;
            } else {
                nums1[numsLength--] = nums1[m - 1];
                m--;
            }
        }
    }
}

