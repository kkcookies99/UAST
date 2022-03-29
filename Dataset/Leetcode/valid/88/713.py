 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1[:] = nums1[:m]
        nums2[:] = nums2[:n]
        nums1[:] = nums1 + nums2
        nums1[:] = sorted(nums1)

