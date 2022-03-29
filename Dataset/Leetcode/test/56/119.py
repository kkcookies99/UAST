 class Solution:
    def XXX(self, _intervals):

        intervals = [[x.start, x.end] for x in _intervals]
        intervals.sort(key=lambda x: (x[0], x[1]))

        i = 1
        while i < len(intervals):
            if intervals[i][0] <= intervals[i-1][1]:
                intervals[i-1][0] = min(intervals[i][0], intervals[i-1][0])
                intervals[i-1][1] = max(intervals[i][1], intervals[i-1][1])
                del intervals[i]
            else:
                i += 1

        return intervals

