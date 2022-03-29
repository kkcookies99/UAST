class Solution:
    def XXX(self, nums):

        sum, ret = 0, nums[0]
        for i in nums:
            sum = max(sum+i, i)
            ret = max(ret, sum)
        return ret

