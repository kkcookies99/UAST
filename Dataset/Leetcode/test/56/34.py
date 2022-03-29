class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        res = []
        intervals.sort()
        [l, r] = intervals[0]
        for interval in intervals[1:] :
            if interval[0] <= r : r = max(interval[1], r) # 有相交
            else :
                res.append([l,r])
                [l ,r] = interval
        return res + [[l,r]]

