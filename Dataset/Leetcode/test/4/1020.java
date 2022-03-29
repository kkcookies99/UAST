 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] tmp = new int[n1 + n2];
        int p1 = 0, p2 = 0, p = 0;
        while (p1 < n1 && p2 < n2) {
            tmp[p++] = nums1[p1] > nums2[p2] ? nums2[p2++] : nums1[p1++];
        }
        while (p1 < n1) {
            tmp[p++] = nums1[p1++];
        }
        while (p2 < n2) {
            tmp[p++] = nums2[p2++];
        }
        return (n1 + n2) % 2 == 0 ? (tmp[n / 2 - 1] + tmp[n / 2]) * 1.0 / 2 : tmp[(n1 + n2) / 2];
    }
}

