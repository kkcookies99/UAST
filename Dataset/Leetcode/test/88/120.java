     public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int lenB = nums2.length;
        int lenA = nums1.length - lenB;
        int a = lenA - 1;
        int b = lenB - 1;
        int index = nums1.length-1;
        while(a>=0&&b>=0){
            int v = (nums1[a]>=nums2[b])?nums1[a--]:nums2[b--];
            nums1[index--] = v;
        }
        while(a>=0){
            nums1[index--]=nums1[a--];
        }
        while(b>=0){
            nums1[index--]=nums2[b--];
        }
    }

