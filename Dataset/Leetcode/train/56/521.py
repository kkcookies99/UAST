 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals)<2:
            return intervals
        intervals = sorted(intervals,key=lambda x:x[0])
        res = []
        res.append(intervals[0])
        j = 0
        for i in intervals[1:]:
            if i[0]<=res[j][1]:
                res[j][1]=max(res[j][1],i[1])
            else:
                res.append(i)
                j+=1
        return res

