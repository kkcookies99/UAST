class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        res=[]
        intervals.sort()
        res.append(intervals[0])
        for i in range(1,len(intervals)):
            t=res[-1]
            if intervals[i][0]<=t[1]:
                res[-1][1]=max(intervals[i][1],res[-1][1])
            else:
                res.append(intervals[i])
        return res

