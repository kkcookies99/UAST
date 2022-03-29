 class Solution {
   public double XXX(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        int midPos = (nums1.length + nums2.length) / 2;
        int in1 = 0;
        int in2 = 0;
        int firstValue = 0;
        int secondValue = 0;
        while (in1 + in2 <= midPos) {
            firstValue = secondValue;
            if (in1 < nums1.length) {
                if (in2 < nums2.length) {
                    if (nums1[in1] >= nums2[in2]) {
                        secondValue = nums2[in2];
                        in2++;
                        continue;
                    } else {
                        secondValue = nums1[in1];
                        in1++;
                        continue;
                    }
                }
            }
            if (in1 >= nums1.length) {
                secondValue = nums2[in2];
                in2++;
                continue;
            }
            if (in2 >= nums2.length) {
                secondValue = nums1[in1];
                in1++;
                continue;
            }
        }
        if (totalLen % 2 == 0) {
            return ((double) (firstValue + secondValue)) / 2;
        } else {
            return (double) secondValue;
        }
    }
}

