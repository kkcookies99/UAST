class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = [[]]
        for num in nums:
            tmp = res[:]
            for item in res:
                tmp.append(item + [num])     
            res = tmp[:]
            
        return res

