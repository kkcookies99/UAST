 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals=sorted(intervals,key=lambda x:x[0])
        res=[]
        for interval in intervals:
            if not res or res[-1][1] < interval[0]:
                res.append(interval)
            else:
                res[-1][1]=max(res[-1][1],interval[1])
        return res

