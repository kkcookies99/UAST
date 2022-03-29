// 划分数组
class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return XXX(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0, right = m;
        // median1：前一部分的最大值
        // median2：后一部分的最小值
        int median1 = 0, median2 = 0;

        while (left <= right) { // 一直循环找到一个最大的i满足A[i-1]≤B[j]
            // 前一部分包含 nums1[0 .. i-1] 和 nums2[0 .. j-1]
            // 后一部分包含 nums1[i .. m-1] 和 nums2[j .. n-1]
            int i = (left + right) / 2; //二分法,i从区间中间开始
            int j = (m + n + 1) / 2 - i;//+1的操作将总数为奇数和偶数合并为一种情况

            //nums_im1, nums_i, nums_jm1, nums_j 分别表示 nums1[i-1], nums1[i], nums2[j-1], nums2[j]
            //当一个数组不出现在前一部分时,对应的值为负无穷,就不会对前一部分的最大值产生影响
            int nums_im1 = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
            //当一个数组不出现在后一部分时,对应的值为正无穷,就不会对后一部分的最小值产生影响
            int nums_i = (i == m ? Integer.MAX_VALUE : nums1[i]);
            int nums_jm1 = (j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
            int nums_j = (j == n ? Integer.MAX_VALUE : nums2[j]);

            if (nums_im1 <= nums_j) {
                median1 = Math.max(nums_im1, nums_jm1);
                median2 = Math.min(nums_i, nums_j);
                left = i + 1;
            }
            else {
                right = i - 1;
            }
        }
        return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
    }
}