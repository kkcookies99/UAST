 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums = sorted(nums1 + nums2)
        x = len(nums)
        if x%2==0:
            i = x//2-1
            return (nums[i]+nums[i+1])/2
        else:
            i = x//2
            return nums[i]

