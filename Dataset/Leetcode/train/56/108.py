 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key = lambda x: x[0])
        res = []
        
        for i in range(len(intervals)):
            if not res or res[-1][-1] < intervals[i][0]:
                res.append(intervals[i])
            if intervals[i][0] <= res[-1][-1] <= intervals[i][-1]:
                res[-1][-1] = intervals[i][-1]
        return res

