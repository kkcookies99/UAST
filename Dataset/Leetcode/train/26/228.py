 class Solution:
    def XXX(self, nums: List[int]) -> int:
        cur = 0
        for i in range(1,len(nums)):

            if nums[i] != nums[cur]:    
                cur += 1
                nums[cur] = nums[i]
   
        return cur+1

