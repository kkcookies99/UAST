 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        re = 0
        while target > nums[len(nums)-1]:
            re = len(nums)
            break
        while target < nums[0]:
            re = 0
            break
        
        if target in nums:
            for i in range(0, len(nums)):
                if target == nums[i]:
                    re =i
                    break
                    
        else:
            for i in range(0, len(nums)):
                if target < nums[i]:
                    re = i
                    break
        return re

