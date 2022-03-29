 public double XXX(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        if (nums1.length == 0) {
            return findMedian(nums2);
        }
        if (nums2.length == 0) {
            return findMedian(nums1);
        }
        double result;
        int len = (nums1.length + nums2.length);
        int mid = len / 2;
        int y = len % 2;
        int n1, n2, i1=0, i2=0, last1=0, last2=0;
        for (int i = 0; i <= mid; i++) {
            if (i1 < nums1.length) {
                n1 = nums1[i1];
            } else {
                n1 = Integer.MAX_VALUE;
            }
            if (i2 < nums2.length) {
                n2 = nums2[i2];
            } else {
                n2 = Integer.MAX_VALUE;
            }
            if (n1 < n2) {
                i1++;
                if (i == mid) {
                    last1 = n1;
                }
                if (i == mid - 1) {
                    last2 = n1;
                }
            } else {
                i2++;
                if (i == mid) {
                    last1 = n2;
                }
                if (i == mid - 1) {
                    last2 = n2;
                }
            }
        }
        if (y == 0) {
            result = (double) (last1 + last2) / 2;
        } else {
            result = last1;
        }
        return result;
    }

    private double findMedian(int[] nums) {
        int mid = nums.length / 2;
        if (nums.length % 2 == 0) {
            return  (double) (nums[mid - 1] + nums[mid]) / 2;
        } else {
            return nums[mid];
        }
    }

