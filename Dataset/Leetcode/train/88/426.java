 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        m -= 1;
        //插入排序
        for (int i = 0; i < n; i++) {
            int j = m + i;
            while (j >= 0 && nums1[j] >= nums2[i]) {
                nums1[j + 1] = nums1[j];
                j -= 1;
            }
            nums1[j + 1] = nums2[i];
        }
    }
}

