 public void XXX(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0) nums1[m+n-1] = (m == 0 || nums1[m-1] < nums2[n-1]) ? nums2[--n] : nums1[--m];
    }

