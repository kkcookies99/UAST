 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if nums2:
            for i in nums2:
                nums1.insert(0, i)
                del nums1[-1]
            nums1.sort()
        return nums1

