 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        j=-1
        for i in nums2:
            nums1[j]=i
            j-=1
        nums1.sort()

