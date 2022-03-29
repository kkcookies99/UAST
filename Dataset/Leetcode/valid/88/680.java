 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m,j=0;  j<nums2.length ; j++,i++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}

