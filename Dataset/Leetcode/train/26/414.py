 class Solution:
    def XXX(self, nums: List[int]) -> int:
        for i in range(len(nums)-1,-1,-1):
            if i-1>-1 and nums[i]==nums[i-1]:
                nums.pop(i) 
        return len(nums)

