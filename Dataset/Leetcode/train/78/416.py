 class Solution(object):
    def XXX(self, nums):
        res=[]
        def sbs(lst):

            if len(lst)==1:
                res.append(lst)
                return 

            sbs(lst[1:])
            le=len(res)

            for i in range(le):
                one=res[i][:]
                one.append(lst[0])
                res.append(one)
            res.append([lst[0]])
            
            return 

        sbs(nums)
        return res+[[]]

