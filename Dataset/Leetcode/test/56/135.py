 class Solution:
    def XXX(self, intervals: List[Interval]) -> List[Interval]:
        res=[]
        intervals.sort(key=lambda x:x.start)
        for i in intervals :
            if res and i.start<=res[-1].end:
                res[-1].end=max(res[-1].end,i.end)
            else:
                res.append(i)
        
        return res

