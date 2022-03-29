 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
      // 第一个数组为空，直接把第二个数组复制到第一个当中
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        // 第二个数组为空，直接返回
        if (n == 0) return;

        // 创建第三个数组
        int[] nums3 = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        // 比较第一个和第二个数组
        while (j < m && k < n) {
            // 因为 1,2有序，把元素添加第三个数组中
            if (nums1[j] <= nums2[k]) nums3[i++] = nums1[j++];
            else nums3[i++] = nums2[k++];
        }
        if (j == m) {
            System.arraycopy(nums2, k, nums3, i, n - k);
        }
        if (k == n) {
            System.arraycopy(nums1, j, nums3, i, m - j);
        }
        // 把第三个数组复制到第一个数组中
        System.arraycopy(nums3, 0, nums1, 0, m + n);
    }
}

