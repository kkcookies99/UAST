 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums = sorted(nums1+nums2)
        if len(nums)%2 == 1:
            return float(nums[len(nums)>>1])
        return (nums[(len(nums)>>1)-1]+nums[len(nums)>>1])/2

