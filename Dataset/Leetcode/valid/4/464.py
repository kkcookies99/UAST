 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums = nums1 + nums2
        nums.sort()
        n = len(nums)
        if n%2==0:
            return float((nums[(n-1)//2]+nums[(n+1)//2])/2)
        else:
            return float(nums[n//2])


