 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        result = []
        self.XXX_recursive(nums, 0, [], result)
        return result
        
    def XXX_recursive(self, nums, index, currPermutation, result):
        if index == len(nums):
            result.append(currPermutation)
        else: # create a new permutation by adding current number at every position
            for i in range(len(currPermutation) + 1):
                newPermutation = list(currPermutation) # copy
                newPermutation.insert(i, nums[index]) # insert (or append)
                self.XXX_recursive(nums, index + 1, newPermutation, result)

