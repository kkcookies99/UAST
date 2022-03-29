 public void XXX(int[] nums1, int m, int[] nums2, int n) {
    for (int i = m-1, j = n-1, k = m+n-1; k >= 0 && j >= 0; k--)
        if (i >= 0 && nums1[i] > nums2[j])
            nums1[k] = nums1[i--];
        else
            nums1[k] = nums2[j--];
}
