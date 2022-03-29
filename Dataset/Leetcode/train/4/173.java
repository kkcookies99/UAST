     public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int tolLen = len1+len2;
        int[] nums = new int[tolLen];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {
            nums[k++] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < len1) nums[k++] = nums1[i++];
        while (j < len2) nums[k++] = nums2[j++];
        if(tolLen % 2 == 0) return (nums[tolLen/2] + nums[tolLen/2-1])/2.0;
        return nums[tolLen/2]/1.0;
    }

