class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res=[[]]
        for i in range(len(nums)):
            size=len(res)
            for j in range(0,size):
                tmp=list(res[j])
                tmp.append(nums[i])
                res.append(tmp)
        return res

