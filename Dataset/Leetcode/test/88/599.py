 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        for i in range(0,n):
            nums1[m+i]=nums2[i]
        nums1.sort()
        return nums1

