 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];

        int pointer1 = 0, pointer2 = 0, index = 0;
        while (pointer1 < nums1.length || pointer2 < nums2.length) {
            if (pointer1 < nums1.length && pointer2 < nums2.length) {
                if (nums1[pointer1] < nums2[pointer2]) {
                    nums[index++] = nums1[pointer1++];
                } else {
                    nums[index++] = nums2[pointer2++];
                }
                continue;
            }

            while (pointer1 < nums1.length) {
                nums[index++] = nums1[pointer1++];
            }
            while (pointer2 < nums2.length) {
                nums[index++] = nums2[pointer2++];
            }
        }

        double res;
        if (nums.length % 2 == 0) {
            res = (nums[nums.length/2-1]+nums[nums.length/2])/2.0;
        } else {
            res = nums[nums.length/2];
        }
        return res;
    }
}

