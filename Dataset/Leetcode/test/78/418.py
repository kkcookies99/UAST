 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) == 0:
            return [[]]
        res = []
        def add(a, num):
            res.append(a)
            if len(num) == 0:
                return
            for i in range(len(num)):
                add(a+[num[i]], num[i+1:])
        add([], nums)
        return res

