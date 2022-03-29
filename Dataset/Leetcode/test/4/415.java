 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int index = 0, index1 = 0, index2 = 0;

        while(index1 < nums1.length && index2 < nums2.length)
            mergedArray[index++] = nums1[index1] < nums2[index2] ? nums1[index1++] : nums2[index2++];
        
        if (index1 < nums1.length) {
            System.arraycopy(nums1, index1, mergedArray, index, nums1.length - index1);
        } else if (index2 < nums2.length) {
            System.arraycopy(nums2, index2, mergedArray, index, nums2.length - index2);
        }
        
        int n = mergedArray.length;
        if (n % 2 != 0) {
            return (double)mergedArray[n / 2];
        } else {
            double d1 = (double)mergedArray[n / 2];
            double d2 = (double)mergedArray[n / 2 - 1];
            return (d1 + d2) / 2;
        }        
    }
}

