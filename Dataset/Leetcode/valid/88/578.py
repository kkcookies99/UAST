 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        for i in range(len(nums1)):
            if len(nums1) > m:
                nums1.pop()
            else:
                break
        for i in range(len(nums2)):
            if len(nums2) > n:
                nums2.pop()
            else:
                break
        nums1.extend(nums2)
        nums1.sort()

