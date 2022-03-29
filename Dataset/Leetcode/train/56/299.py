 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        res = [intervals[0]]
        for i in range(1, len(intervals)):
            if intervals[i][0] <= res[-1][1] and intervals[i][1] >= res[-1][0]:
                res[-1] = [min(intervals[i][0], res[-1][0]), max(intervals[i][1], res[-1][1])]
            else:
                res.append(intervals[i])
        return res

