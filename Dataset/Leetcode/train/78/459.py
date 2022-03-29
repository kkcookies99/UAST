 class Solution(object):
     def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        arrlen = len(nums)
        res = [[]]
        for i in range(0, arrlen):
            for j in range(0, len(res)):
                templist = res[j][:]
                templist.append(nums[i])
                res.append(templist)
        return res

