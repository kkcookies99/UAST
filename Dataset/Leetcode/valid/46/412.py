 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums)<=1:
            return [nums]
        res=[]
        for i in range(len(nums)):
            tmp=self.XXX(nums[0:i]+nums[i+1:])
            for per in tmp:
                res.append(per+[nums[i]])
        return res 

