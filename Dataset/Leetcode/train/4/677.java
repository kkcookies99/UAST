 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] keep = new int[length1 + length2];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < length1 || j < length2) {
            int k1 = i < length1 ? nums1[i] : 10000000;
            int k2 = j < length2 ? nums2[j] : 10000000;
            int k3 = 0;
            if (k1 < k2) {
                k3 = k1;
                i++;
            } else {
                k3 = k2;
                j++;
            }
            keep[k] = k3;

//            如果是奇数
            if ((keep.length / 2)*2 != keep.length && keep.length / 2 == k) {
                return keep[k];
            } else if ((keep.length / 2)*2 == keep.length &&keep.length / 2 == k) {
                return ((double) keep[k] + keep[k - 1]) / 2;

            }
            k++;
        }
        return 0;
    }
}

