 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        i, j = 0, 1
        init = nums[0]
        
        while(j < len(nums)):
            if nums[j] > init:
                init = nums[j]
                i += 1
                if i != j: nums[i], nums[j] = nums[j], nums[i]
            j += 1
            
        return i + 1

