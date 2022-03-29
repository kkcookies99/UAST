 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals)
        res = [intervals[0]]
        for i in range(1, len(intervals)):
            if intervals[i][0] > res[-1][1]:
                res.append(intervals[i])
            else:
                res[-1][1] = max(res[-1][1], intervals[i][1])
        return res

