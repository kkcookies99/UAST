 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        while n > 0: nums1[m+n-1], m, n = (nums1[m-1], m-1, n) if m and nums1[m-1] > nums2[n-1] else (nums2[n - 1], m, n-1)

