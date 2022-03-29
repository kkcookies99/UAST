 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i ++){
            nums1[i] = nums2[j];
            j ++;
            if (j == n)
                break;
        }
        Arrays.sort(nums1);
    }
}


