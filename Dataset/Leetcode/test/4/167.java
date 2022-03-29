 public double XXX(int[] nums1, int[] nums2) {
        int m =  nums1.length;
        int n = nums2.length;
        int length = nums1.length + nums2.length;
        int val1 = 0, val2 = 0, p = 0, k = 0;
        while (p + k < length / 2 + 1) {
            val1 = val2;
            if (k == n) {
                val2 = nums1[p++];
                continue;
            }
            if (p == m || nums1[p] >= nums2[k]) {
                val2 = nums2[k++];
            } else {
                val2 = nums1[p++];
            }
        }
    
        if (length % 2 == 0) {
            return (double)(val1 + val2) / 2;
        }
        return Math.max(val1, val2);
    }

