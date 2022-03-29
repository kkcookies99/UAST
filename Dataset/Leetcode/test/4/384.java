 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int p1 = 0, p2 = 0;
        int len = nums.length;
        int i = 0;
        while(p1 < nums1.length && p2 < nums2.length){
            nums[i++] = nums1[p1] <= nums2[p2] ? nums1[p1++] : nums2[p2++];
        }

        while(p1 < nums1.length ){
            nums[i++] = nums1[p1++] ;
        }
        while(p2 < nums2.length ){
            nums[i++] = nums2[p2++] ;
        }
        
        if((len & 1) == 1)
            return nums[len/2];
        else
            return (nums[len/2] + nums[len/2-1]) / 2.0;
    }
    

}

