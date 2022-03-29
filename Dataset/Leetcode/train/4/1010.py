 class Solution:
    def XXX(self,nums1: List[int], nums2: List[int]) -> float:
        nums=nums1+nums2
        nums.sort()
        L=len(nums)
        if (L % 2 == 1):
            return nums[int(L / 2)]
        return (nums[int(L / 2 - 1)] + nums[int(L / 2)]) / 2

