 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """        
        temp = {}
        for i in range(len(nums)):            
            num = nums[i]
            diff = target - num            
            try:
                return[temp[diff],i]                 
            except:
                temp[num] = i


