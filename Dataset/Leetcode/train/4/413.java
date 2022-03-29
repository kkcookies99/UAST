 public double XXX(int[] nums1, int[] nums2) {
        int num = nums1.length + nums2.length;
        int[] all = new int[num];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                all[index++] = nums1[i++];
            }else {
                all[index++] = nums2[j++];
            }
        }
        if (i == nums1.length) {
            for (int k = j; k < nums2.length; k++) {
                all[index++] = nums2[k];
            }
        }else {
            for (int k = i; k < nums1.length; k++) {
                all[index++] = nums1[k];
            }
        }
        if ((num % 2) == 0) {
            return (double)(all[num/2 - 1] + all[num/2])/2;
        }else {
            return (double)all[(num -1) / 2];
        }
    }

