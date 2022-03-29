 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        for (int i = 0, j = 0; i < m; i++) {
            for (; j < n; j++) {
                // 小于
                if (nums2[j] < nums1[i]) {
                    // 包含当前元素全部后移
                    for (int k = m - 1; k >= i; k--) {
                        nums1[k+1] = nums1[k];
                    }
                    nums1[i] = nums2[j];
                    m++;
                }
                // 中间且不是最后
                else if (m - 1 > i && nums2[j] >= nums1[i] && nums2[j] < nums1[i+1]) {
                    // 当前元素后一个全部后移
                    for (int k = m - 1; k >= i + 1; k--) {
                        nums1[k+1] = nums1[k];
                    }
                    nums1[i+1] = nums2[j];
                    i++;
                    m++;
                }
                // 最后一个
                else if (m - 1 == i) {
                    nums1[i+1] = nums2[j];
                    i++;
                    m++;
                }
                // 大于
                else {
                    break;
                }
            }
        }
    }
}

