 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];
        for (int i = 0, j = 0, k = 0; i < (m + n); i++) {
            // num2的长度大于num1的长度的情况
            if (j == m) {
                // 确保num2长度不越界
                if (k < n) {
                    arr[i] = nums2[k];
                    k++;
                }
            }
            // num1的长度大于num2的长度情况
            if (k == n) {
                // 确保num1长度不越界
                if (j < m) {
                    arr[i] = nums1[j];
                    j++;
                }
            }
            // 新数组arr从小到大排序
            if (j < m && k < n) {
                if (nums1[j] < nums2[k]) {
                    arr[i] = nums1[j];
                    j++;
                } else {
                    arr[i] = nums2[k];
                    k++;
                }
            }
        }
        return (m + n) % 2 == 0 ? (double) (arr[(m + n) / 2] + arr[(m + n) / 2 - 1]) / 2 : (double) arr[(m + n) / 2];
    }
}

