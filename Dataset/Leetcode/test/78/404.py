 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        self.out = []
        self.sub(nums,0,[])
        return self.out
    def sub(self,nums,start,sub):
        self.out.append(sub)
        if len(sub)==len(nums):
            return
        for i in range(start,len(nums)):
            self.sub(nums,i+1,sub+[nums[i]])

