 class Solution:
    def XXX(self, nums: 'List[int]', target: 'int') -> 'List[int]':
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                sumx = nums[i] + nums[j]
                if sumx == target:
                    return [i,j]

