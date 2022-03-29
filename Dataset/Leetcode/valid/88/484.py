 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # nums1.extend(nums2)
        # nums1.sort()
        # for i in range(n):
        #     nums1.remove(0)
        
        nums1[m:]=nums2[:]
        nums1.sort()
        return nums1

