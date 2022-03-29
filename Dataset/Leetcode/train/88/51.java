 public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int tail = nums1.length-1;
        if (m == 0) {
            nums1 = Arrays.copyOf(nums2, n);
        } else if (n>0){
            while (p1>=0 && p2>=0) {
                if (nums1[p1] > nums2[p2]) {
                    nums1[tail--] = nums1[p1--];
                } else {
                    nums1[tail--] = nums2[p2--];
                }
            }
        }
    }

