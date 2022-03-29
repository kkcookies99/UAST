class Solution(object):
    def XXX(self, nums):
        n = len(nums) 
        res = nums[0]
        max_num = nums[0]

        for i in range(1, n):
            if max_num <= 0:
                max_num = nums[i]
            else:
                max_num += nums[i]
            res = max(res, max_num)

        return res

