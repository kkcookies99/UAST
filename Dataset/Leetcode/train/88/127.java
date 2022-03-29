 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m - 1, j = n - 1; i >= 0 || j >= 0;) {
            int v1 = i >= 0 ? nums1[i] : Integer.MIN_VALUE;
            int v2 = j >= 0 ? nums2[j] : Integer.MIN_VALUE;
            if(v1 > v2) {
                nums1[i + j + 1] = nums1[i--];
            } else {
                nums1[i + j + 1] = nums2[j--];
            }
        }
    }
}

