 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        def pd(a, b):
            if b[0] <= a[1]:
                return True
        res = []
        if not len(intervals):
            return res
        res.append(intervals[0])
        for i in range(1, len(intervals)):
            if pd(res[-1], intervals[i]):
                res[-1] = [res[-1][0], max(res[-1][1], intervals[i][1])]
            else:
                res.append(intervals[i])
        return res

