 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        left, right, index = m - 1, n - 1, m + n - 1
        while left >= 0 and right >= 0:
            if nums2[right] >= nums1[left]:
                nums1[index] = nums2[right]
                index -= 1
                right -= 1
            else:
                nums1[index] = nums1[left]
                left -= 1
                index -= 1
        if right >= 0:
            for i in range(right + 1):
                nums1[i] = nums2[i]

