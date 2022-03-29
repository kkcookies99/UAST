 public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int l = m + n;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[--l] = nums1[--m];
            } else {
                nums1[--l] = nums2[--n];
            }
        }

        while (n > 0) {
            nums1[--l] = nums2[--n];
        }
    }

