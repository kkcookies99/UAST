class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        if intervals==[]:
            return intervals
        intervals.sort()
        res=[intervals[0]]
        for l,r in intervals[1:]:
            if l>res[-1][1]:
                res.append([l,r])
            else:
                res[-1][1]=max(r,res[-1][1])
        return res

