 class Solution:
    def XXX(self,s):
        max_length=0
        res=[]
        for i in s:
            while i in res:
                res.pop(0)
            res.append(i)
            max_length=max(max_length,len(res))
        return max_length


