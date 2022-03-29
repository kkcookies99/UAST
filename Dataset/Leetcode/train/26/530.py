 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if len(nums)<=1:
            return nums
        else:
            i=1
            while i<len(nums):
                if nums[i]==nums[i-1]:
                    nums.pop(i)
                else:
                    i=i+1
        return nums

