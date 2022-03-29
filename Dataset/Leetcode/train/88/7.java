 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for(int index = 0 ;index < n;index ++){
            nums1[m++] = nums2[index];
        }
        Arrays.sort(nums1);
    }
}

