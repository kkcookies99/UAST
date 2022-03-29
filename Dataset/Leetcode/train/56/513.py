 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals) == 1:
            return intervals
        
        intervals.sort(key=lambda p: p[0])
        res = [intervals[0]]
        for pair in intervals[1:]:
            last = res[-1]
            if last[0] <= pair[0] <= last[1]:
                last[1] = max(pair[1], last[1])
            else:
                res.append(pair)
        return res


