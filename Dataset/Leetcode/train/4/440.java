 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
//         用查找第k个数的思想来做
        int n = nums1.length, m = nums2.length, len = (n + m) / 2 + 1;
//         按奇偶讨论
        if ((n + m) % 2 == 1) {
            return findK(nums1, 0, nums2, 0, len);
        } else {
            return (findK(nums1, 0, nums2, 0, len - 1) + findK(nums1, 0, nums2, 0, len)) / 2.0;
        }
    }
//     i和j为A、B数组的起始位置
    public int findK(int[] A, int i, int[] B, int j, int k) {
//         一个数组全都被舍弃后直接返回
        if (i >= A.length) {
            return B[j + k - 1];
        }
        if (j >= B.length) {
            return A[i + k - 1];
        }
//         边界情况
        if (k == 1) {
            return Math.min(A[i], B[j]);
        }
//         舍弃较小的前k/2个数
//         如果某个数组可能越界就舍弃另一个数组的前k/2个数
        int A_key = i + k / 2 - 1 < A.length ? A[i + k / 2 - 1] : Integer.MAX_VALUE;
        int B_key = j + k / 2 - 1 < B.length ? B[j + k / 2 - 1] : Integer.MAX_VALUE;
//         舍弃k/2个数后，问题变为查找第k - k / 2个数
        if (A_key < B_key) {
            return findK(A, i + k / 2, B, j, k - k / 2);
        } else {
            return findK(A, i, B, j + k / 2, k - k / 2);
        }
    }
}

