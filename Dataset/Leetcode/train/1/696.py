 class Solution:
    def XXX(self, nums, target):
        '''
         nums: List[int]
         target: int
        '''
        for index,num in enumerate(nums):
            num2 = target - num
            if num2 in nums:
                return index

