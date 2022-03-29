 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int i = 0, j = 0;

        int totalLength = nums1.length + nums2.length;

        int arrayLength = totalLength/2 + 1;

        int[] nums = new int[arrayLength];
        int index = 0;

        while ((i < nums1.length || j < nums2.length) && index < arrayLength) {

            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    nums[index] = nums1[i];
                    i ++;
                } else {
                    nums[index] = nums2[j];
                    j ++;
                }
            } else if (i < nums1.length) {
                nums[index] = nums1[i];
                i ++;
            } else {
                nums[index] = nums2[j];
                j ++;
            }
            index ++;
        }

        // 输出结果根据totalLength和arrayLength公共确定
        if (totalLength % 2 == 0) {
            return (nums[arrayLength - 1] + nums[arrayLength - 2])/2.0;
        }
        return nums[arrayLength - 1];
    }
}

