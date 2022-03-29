 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        for i in range(n):
            nums1.remove(0)
        for i in nums2:
            nums1.append(i)
        nums1=nums1.sort()

