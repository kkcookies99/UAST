 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] tmp = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int cur = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                tmp[cur] = nums1[i];
                i++;
            } else {
                tmp[cur] = nums2[j];
                j++;
            }
            cur++;
        }
        while (i < nums1.length) {
            tmp[cur] = nums1[i];
            i++;
            cur++;
        }
        while (j < nums2.length) {
            tmp[cur] = nums2[j];
            j++;
            cur++;
        }
        int n = tmp.length;
        for (int it = 0;it < n;it++) {
            System.out.print(tmp[it]+ " ");
        }
        if (n % 2 == 0) {
            return (double)((double)tmp[n/2] + (double)tmp[n/2 - 1])/2.0d;
        } else {
            return tmp[n/2];
        }
    }
}

