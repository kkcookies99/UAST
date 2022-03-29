 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int len = nums.length;
        int mid = len / 2;
        if (len % 2 == 0) {
            return (nums[mid - 1] + nums[mid]) / 2.0;
        }else{
            return nums[mid];
        }
    }
}

