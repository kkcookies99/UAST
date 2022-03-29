 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:

        """
        Do not return anything, modify nums1 in-place instead.
        """
        j=0
        for i in range(m,len(nums1)):
            nums1[i]=nums2[j]
            j=j+1
        nums1.sort()

