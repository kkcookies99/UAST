 public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        nums1=Arrays.stream(nums1).sorted().toArray();
    }

