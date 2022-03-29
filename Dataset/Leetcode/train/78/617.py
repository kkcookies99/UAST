 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums)==0:
            return [[]]
        if nums==1:
            return [[], nums]
        
        ans = self.XXX(nums[:-1])
        ans += [i+[nums[-1]] for i in ans]
        
        return ans

