 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        nums1=sorted(nums1+nums2)
        while 0 in nums1:
            nums1.remove(0)

