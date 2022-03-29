     public double XXX(int[] nums1, int[] nums2) {
        //将两个数组合成一个数组
        //从选出数组中间的1-2个数
        //根本不用把两个数组合并完 只需要拿到合并数组的中位
        int totalLength = nums1.length + nums2.length;
        int[] nums3 = new int[(totalLength) / 2 + 1]; //合成数组的一半

        if (nums3.length == 0)
            return 0;

        int j = 0, k = 0;
        for (int i = 0; i < nums3.length; i++) {
            if (j < nums1.length && k < nums2.length) {
                if (nums1[j] < nums2[k]) {
                    nums3[i] = nums1[j++];
                    continue;
                } else {
                    nums3[i] = nums2[k++];
                    continue;
                }
            }

            if (j >= nums1.length && k < nums2.length) {
                nums3[i] = nums2[k++];
            }

            if (k >= nums2.length && j < nums1.length) {
                nums3[i] = nums1[j++];
            }
        }

        return totalLength % 2 == 0 ? (nums3[nums3.length - 2] + nums3[nums3.length - 1]) / 2d : nums3[nums3.length - 1];
    }

