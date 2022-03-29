 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        max_right = 0
        for i in range(len(nums)):
            if max_right < i:return False
            max_right = max(nums[i]+i,max_right) 
        return True

