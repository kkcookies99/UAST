 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        --m;
        --n;
        while(n >= 0) {
            if(m < 0 || nums1[m] < nums2[n]) {
                nums1[n + m + 1] = nums2[n--];
            } else {
                nums1[n + m + 1] = nums1[m--];
            }
        }
    }
}

