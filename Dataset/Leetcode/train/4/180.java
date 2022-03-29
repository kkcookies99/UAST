     public double XXX(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int p1 = 0,p2 = 0;
        int i = 0;
        while(p1 < nums1.length && p2 < nums2.length){
            nums3[i++] = nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
        }
        while(p1 < nums1.length)
            nums3[i++] = nums1[p1++];
        while(p2 < nums2.length)
            nums3[i++] = nums2[p2++];

        double median = 0;
        int n = nums3.length;
        if(nums3.length % 2 == 0)
            median = (nums3[n/2 - 1] + nums3[n/2] ) / 2.0;
        else 
            median = nums3[n/2];

        return median;
    }

