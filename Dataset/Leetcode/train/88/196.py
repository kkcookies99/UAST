 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1 = list(set(nums1))
        if 0 in nums1:
           nums1.remove(0)
        nums1 = nums1 + nums2
        nums1.sort()
