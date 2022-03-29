 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        for i in range(m + n - 1, -1, -1):
            if m == 0 or n > 0 and nums1[m - 1] < nums2[n - 1]:
                nums1[i] = nums2[n - 1]
                n -= 1
            elif n == 0 or m > 0 and nums1[m - 1] >= nums2[n - 1]:
                nums1[i] = nums1[m - 1]
                m -= 1

