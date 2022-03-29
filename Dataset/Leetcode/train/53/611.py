 class Solution(object):
    def __init__(self):
        self.numlist=[]
        self.sumlist=[]
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==1:
            self.numlist.append(nums)
        else:
            for i in range(len(nums)):
                self.numlist.append(nums[i:i+len(nums)])
            return self.XXX(nums[0:len(nums)-1])
    def solution(self):
        for i in self.numlist:
            self.sumlist.append(sum(i))
        return max(self.sumlist)

