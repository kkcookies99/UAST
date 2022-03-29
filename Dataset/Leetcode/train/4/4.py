# 划分数组
class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        if len(nums1) > len(nums2):
            return self.XXX(nums2, nums1)


        infinty = 2**40  # 代表正无穷
        m, n = len(nums1), len(nums2)
        left, right = 0, m
        # median1：前一部分的最大值
        # median2：后一部分的最小值
        median1, median2 = 0, 0


        while left <= right: # 一直循环找到一个最大的i满足A[i−1]≤B[j]
            # 前一部分包含 nums1[0 .. i-1] 和 nums2[0 .. j-1]
            # // 后一部分包含 nums1[i .. m-1] 和 nums2[j .. n-1]
            i = (left + right) // 2
            j = (m + n + 1) // 2 - i


            # nums_im1, nums_i, nums_jm1, nums_j 分别表示 nums1[i-1], nums1[i], nums2[j-1], nums2[j]
            # 当一个数组不出现在前一部分时,对应的值为负无穷,就不会对前一部分的最大值产生影响
            nums_im1 = (-infinty if i == 0 else nums1[i - 1]) # 注意写法与java不同
            # 当一个数组不出现在后一部分时,对应的值为正无穷,就不会对后一部分的最小值产生影响
            nums_i = (infinty if i == m else nums1[i])
            nums_jm1 = (-infinty if j == 0 else nums2[j - 1])
            nums_j = (infinty if j == n else nums2[j])


            if nums_im1 <= nums_j:
                median1, median2 = max(nums_im1, nums_jm1), min(nums_i, nums_j)
                left = i + 1
            else:
                right = i - 1


        return (median1 + median2) / 2 if (m + n) % 2 == 0 else median1