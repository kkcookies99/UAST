 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums=sorted(nums1+nums2)
        l=len(nums)
        return (nums[int(l/2)]+nums[int((l-1)/2)])/2.0

