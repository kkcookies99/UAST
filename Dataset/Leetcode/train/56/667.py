 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        res = [intervals[0]]
        i = 1
        while i < len(intervals):
            tmp = res[-1]
            if tmp[1] >= intervals[i][0]:
                tmp[1] = max(tmp[1], intervals[i][1])
            else:
                res.append(intervals[i])
            i += 1
        return res

