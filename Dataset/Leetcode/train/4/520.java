 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int cur = 0, nums1Cur = 0, nums2Cur = 0;
        int[] nums = new int[len];
        while(nums1Cur<nums1.length && nums2Cur<nums2.length){
            if(nums1[nums1Cur]>nums2[nums2Cur]) {
                nums[cur++] = nums2[nums2Cur++];
            }
            else {
                nums[cur++] = nums1[nums1Cur++];
            }
        }
        while(nums1Cur<nums1.length) nums[cur++] = nums1[nums1Cur++];
        while(nums2Cur<nums2.length) nums[cur++] = nums2[nums2Cur++];
        if(len%2==0) return (double)(nums[len/2]+nums[len/2-1])/2;
        else return (double)nums[len/2];
    }
}

