     public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int t1 = m - 1, t2 = n - 1, t = m + n - 1;
        while (t1 >= 0 && t2 >= 0) nums1[t--] = nums1[t1] >= nums2[t2] ? nums1[t1--] : nums2[t2--];
        while (t2 >= 0) nums1[t--] = nums2[t2--];
    }

