 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if len(nums1) > m:
            for i in range(n):
                nums1.remove(0)
                nums1.append(nums2[i])
        nums1.sort()

