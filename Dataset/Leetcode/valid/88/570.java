 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int index = n + m - 1;
        int i = m - 1;
        int j = n - 1;
        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[index--] = nums1[i--];
            }else{
                nums1[index--] = nums2[j--];
            }
        }
    }
}

