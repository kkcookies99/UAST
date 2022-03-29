 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] result = new int[len];
        int insert = 0;
        int i = 0;
        int j = 0;
        for(; i < nums1.length && j < nums2.length;) {
            if(nums1[i] < nums2[j]) {
                result[insert++] = nums1[i++];
            } else {
                result[insert++] = nums2[j++];
            }
        }
        int remain[] = i < nums1.length ? nums1 : nums2;
        int remainPos = i < nums1.length ? i : j;
        for(; remainPos < remain.length; remainPos++) {
            result[insert++] = remain[remainPos];
        }
        return len % 2 == 0 ? (result[len / 2 - 1] + result[len / 2]) / 2d : result[len / 2];
    }
}

