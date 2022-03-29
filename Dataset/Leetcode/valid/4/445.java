     public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 > len2) { // 保证nums1是更短的数组
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
            len1 = len2;
            len2 = nums2.length;
        }
        
        int len = len1 + len2;
        int half = len >> 1;
        boolean even = (len & 1) == 0; // 整个数组总个数是否为偶数
        
        
        int i = 0, j = len1, mid; // 先找到中分的点
        while (i < j) {
            mid = (i + j) / 2; // 中点
            int k = half - mid;
            if (k > 0 && nums1[mid] < nums2[k - 1]) {
                i = mid + 1;
            }else if (mid > 0 && nums1[mid - 1] > nums2[k]) {
                j = mid;
            } else { // 已经找到
                i = mid; 
                break;
            }
        }
        
        int k1 = i;
        int k2 = half - k1;
        
        int right = k1 < len1 
            ? (k2 < len2 
               ? Math.min(nums1[k1], nums2[k2])
               : nums1[k1])
            : nums2[k2];
        
        if (!even) {
            return (double)right;
        }
        
        int left = k1 > 0 
            ? (k2 > 0 
               ? Math.max(nums1[k1 - 1], nums2[k2 -1]) 
               : nums1[k1 - 1])
            : nums2[k2 - 1];
        
        return (left + right) / 2.0;
    }

