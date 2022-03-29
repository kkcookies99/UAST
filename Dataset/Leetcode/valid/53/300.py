class Solution(object):
    def XXX(self, nums):
        thisSum,maxSum = 0,nums[0]
        for i in range(len(nums)):
            thisSum += nums[i]
            if thisSum > maxSum: maxSum = thisSum                
            thisSum = max(thisSum, 0)
        return maxSum

