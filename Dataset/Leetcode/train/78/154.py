class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        results = []
        
        self.__XXX(nums, 0, [], results)
        
        return results
    
    def __XXX(self, nums, i, subset, results):
        results.append(subset)
        
        for i in range(i, len(nums)):
            self.__XXX(nums, i+1, subset + [nums[i]], results) 

