class Solution(object):
    def XXX(self, intervals):
        intervals.sort()
        res = []
        for i in range(len(intervals)):
            if not res or intervals[i][0] > res[-1][1]:
                res.append(intervals[i])
            else: 
                res[-1][-1] = max(intervals[i][1], res[-1][1])
        return res

