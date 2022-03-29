class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        results = []
        
        self.__heap_XXX(nums, len(nums), results)
        
        return results
        
    def __heap_XXX(self, nums, n, results):
        if n == 1:
            results.append(nums.copy())
        else:
            for i in range(n):
                self.__heap_XXX(nums, n-1, results)
                if n % 2 == 1:
                    nums[0], nums[n-1] = nums[n-1],nums[0]
                else:
                    nums[i], nums[n-1] = nums[n-1], nums[i]

