class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int to = len1 + len2;
        int i  = (to>>1)+1;
        int[] nums = new int[i];
        int index = 0;
        int index1 = 0;
        int count = 0;
        while (count<i) {
            if (len1 > index && len2 > index1) {
                if (nums1[index] > nums2[index1]) nums[count++] = nums2[index1++];
                else nums[count++] = nums1[index++];
            }else{
                if (len1 > index) nums[count++] = nums1[index++];
                if (len2 > index1) nums[count++] = nums2[index1++];  
            }
        }
        --count;
        if (to % 2 == 0) return ((double) (nums[count] + nums[count - 1])) / 2;
        else return nums[count];
    }
}

