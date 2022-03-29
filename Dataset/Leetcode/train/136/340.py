 class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        dic = {}
        for i in nums:
            if dic.get(i) and dic.get(i) <= 1:
                dic[i] += 1
            else:
                dic[i] = 1
        for k, v in dic.items():
            if v <= 1:
                res = k
        return res

