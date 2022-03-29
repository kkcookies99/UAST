 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int l3 = l1+l2;
        int[] ans = new int[l3];
        int i = 0, j = 0, k = 0;
        while (i < l1 && j < l2) {
            ans[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < l1) {
            ans[k++] = nums1[i++];
        }
        while (j < l2) {
            ans[k++] = nums2[j++];
        }
        double num = 0;
        if (l3 % 2 == 0) {
            num =  (double)(ans[l3/2] + ans[l3/2-1]) / 2;
        } else {
            num = (double)ans[l3/2];
        }
        return num;
    }
}

