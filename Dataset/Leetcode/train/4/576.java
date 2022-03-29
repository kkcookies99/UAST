 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] array = merge(nums1,nums2);
        int length = array.length;
        if(length % 2 != 0) {
            return (double)array[length / 2];
        } else {
            return ((double)(array[length / 2] + array[length/2 - 1])) / 2;
        }
    }
    private int[] merge(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] array = new int[len1 + len2];
        int pointer1 = 0;
        int pointer2 = 0;
        int pointer = 0;
        while(pointer1 < len1 && pointer2 < len2) {
            if(nums1[pointer1] < nums2[pointer2]) {
                array[pointer++] = nums1[pointer1++]; 
            } else {
               array[pointer++] = nums2[pointer2++];  
            }
        }
        while (pointer1 < len1) {
            array[pointer++] = nums1[pointer1++];
        }
        while (pointer2 < len2) {
            array[pointer++] = nums2[pointer2++];
        }
        return array;
    }
}

