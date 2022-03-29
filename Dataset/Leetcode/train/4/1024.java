 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        // 
        int len1 = nums1.length;
        int len2 = nums2.length;
        // 若总长为奇数，则找最中间的，下标为(len1 + len2) / 2 + 1
        // 否则找下标(len1 + len2) / 2和(len1 + len2) / 2 + 1
        double midNum1 = 0;
        double midNum2 = 0;
        int i = 0;
        int j = 0;
        int cur = 0;
        while(cur <= (len2 + len1) / 2) {
            if(i >= nums1.length) {
                cur++;
                midNum1 = midNum2;
                midNum2 = nums2[j++];
            } else if (j >= nums2.length) {
                cur++;
                midNum1 = midNum2;
                midNum2 = nums1[i++];
            } else {
                midNum1 = midNum2;
                cur++;
                if(nums1[i] > nums2[j]) {
                    midNum2 = nums2[j++];
                } else {
                    midNum2 = nums1[i++];
                }
            }
        }
        return (len1 + len2) % 2 == 0 ? (midNum2 + midNum1) / 2 : midNum2;
    }
}```

