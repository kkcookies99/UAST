 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int middleIndex = (nums1.length + nums2.length) / 2;
        int odd = (nums1.length + nums2.length) % 2;
        int nums1Index = 0;
        int nums2Index = 0;
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        while(nums1Index < nums1.length || nums2Index < nums2.length) {
            int value1 = nums1Index == nums1.length ? Integer.MAX_VALUE : nums1[nums1Index];
            int value2 = nums2Index == nums2.length ? Integer.MAX_VALUE : nums2[nums2Index];
            if (nums1Index + nums2Index == middleIndex) {
                if ( odd == 0) {
                    int firstNum = Math.min(value1, value2);
                    int previousValue1 = nums1Index == 0 ? Integer.MIN_VALUE : nums1[nums1Index - 1];
                    int previousValue2 = nums2Index == 0 ? Integer.MIN_VALUE : nums2[nums2Index - 1];
                    int secondNum =  Math.max(previousValue1, previousValue2);
                    return  ((double)(firstNum + secondNum)) / 2;
                } else {
                    return Math.min(value1, value2);
                }
            } else {
                if (value1 <= value2) {
                    nums1Index++;
                } else {
                    nums2Index++;
                }
            }
        }
        return 0;
    }
}

