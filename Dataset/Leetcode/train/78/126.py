class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #子集个数为2**n, n 为nums里面的元素个数
        ret = []
        
        for item in nums:
            ret.append([item])
            for i in range(len(ret) - 1):
                # temp = ret[i] 浅拷贝
                temp = ret[i][:] #深拷贝
                temp.append(item)
                ret.append(temp)
        ret.append([])
        return ret

