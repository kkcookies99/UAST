     public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == nums2.length) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }
        if (nums2.length == 0) {
            return;
        }
        int index = nums1.length - 1;
        while (m > 0 || n > 0) {
            // m=0说明 nums1 已经比较完了，此时把 nums2 剩余的放到 nums1 即可
            if (m == 0 || nums2[n - 1] > nums1[m - 1]) {
                nums1[index] = nums2[n - 1];
                n--;
            } else {
                nums1[index] = nums1[m - 1];
                m--;
            }
            // n=0说明 nums2 比较完，停止
            if (n == 0) {
                break;
            }
            index--;
        }
    }

