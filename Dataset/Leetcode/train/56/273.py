 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        l=[]
        for i in range(len(intervals)):
            if len(l)==0:
                l.append(intervals[i])
            else:
                if intervals[i][0]>l[-1][1]:
                    l.append(intervals[i])
                else:
                    l[-1][0]=min(l[-1][0],intervals[i][0])
                    l[-1][1]=max(l[-1][1],intervals[i][1])
        return l

