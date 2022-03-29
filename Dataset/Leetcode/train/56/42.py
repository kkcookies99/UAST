class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        temp=sorted(intervals,key=lambda x:x[0])
        n=len(temp)
        if n<2:
            return intervals
        cur=temp[0]
        res=[]
        for elem in temp[1:]:
            if elem[0]>cur[1]:
                res.append(cur)
                cur=elem
            elif elem[1]>cur[1]:
                cur[1]=elem[1]
        res.append(cur)
        return res

