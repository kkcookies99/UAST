 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
            int[] nums3 = new int[nums1.length + nums2.length];
            int count = 0;
            int cursor1 = 0;
            int cursor2 = 0;
            if (nums1.length == 0) {
                return getMiddle(nums2);
            }
            if (nums2.length == 0) {
                return getMiddle(nums1);
            }
            while (cursor1 < nums1.length && cursor2 < nums2.length) {
                if (nums1[cursor1] <= nums2[cursor2]) {
                    nums3[count++] = nums1[cursor1++];
                } else {
                    nums3[count++] = nums2[cursor2++];
                }
            }
            while (cursor1 < nums1.length) {
                nums3[count++] = nums1[cursor1++];
            }

            while (cursor2 < nums2.length) {
                nums3[count++] = nums2[cursor2++];
            }
            return getMiddle(nums3);
    }

    public double getMiddle(int[] num) {
        if (num.length == 0) {
            return 0.0000;
        }
        int len = num.length;
        if ((len & 1) == 1) {
            return num[(len + 1)/2 - 1];
        }
        return ((num[len/2] + num[len/2 - 1])/2.0);
    }
}

