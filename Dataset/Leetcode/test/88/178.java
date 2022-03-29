 public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1; i >= 0; i--) {
			if (m > 0 && n > 0) {
				nums1[i] = nums1[m - 1] > nums2[n - 1] ? nums1[--m] : nums2[--n];
			} else if (m == 0) {
				nums1[i] = nums2[--n];
			} else if (n == 0) {
				nums1[i] = nums1[--m];
			}
		}
    }

