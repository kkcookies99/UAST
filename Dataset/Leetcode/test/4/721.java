     public double XXX(int[] nums1, int[] nums2) {
        int n3 = nums1.length + nums2.length;
        int[] nums3 = new int[n3];

        int i = 0, j = 0, k = 0;
        while(i < nums1.length || j < nums2.length) {
            if(i < nums1.length && j < nums2.length) {
                if(nums1[i] < nums2[j]) {
                    nums3[k++] = nums1[i++];
                } else if(nums1[i] > nums2[j]) {
                    nums3[k++] = nums2[j++];
                } else {
                    nums3[k++] = nums1[i++];
                    nums3[k++] = nums2[j++];
                }
            } else if(i >= nums1.length) {
                nums3[k++] = nums2[j++];
            } else {
                nums3[k++] = nums1[i++];
            }
        }

        if(n3 % 2 == 0) {
            return (double) (nums3[n3 / 2 - 1] + nums3[n3 / 2]) / 2;
        } else {
            return nums3[n3 / 2];
        }

    }

