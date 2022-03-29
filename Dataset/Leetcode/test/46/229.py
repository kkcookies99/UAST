class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result=[]
        def dsf(path,res):
            if len(res)==0:
                result.append(path)
                return
            for i in range(len(res)):
                dsf(path+[res[i]],res[:i]+res[i+1:])#path指选中的path, res指可选的剩余值得数组
        dsf([],nums)
        return result

