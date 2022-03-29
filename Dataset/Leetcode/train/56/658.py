 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        n = len(intervals)
        i = 0
        res = []
        while i < n:
            start = intervals[i][0]
            end = intervals[i][1]
            i += 1
            while i < n:
                if intervals[i][0] <= end:
                    end = max(intervals[i][1], end)
                else:
                    break
                i += 1
            res.append([start, end])
        return res
