class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        if not intervals:
            return []
        intervals.sort()
        res = [intervals[0]]
        temp = intervals[0][1]
        for item in intervals[1:]:
            if item[0] <= temp:
                if item[1] > temp:
                    res[-1][1] = item[1]
            else:
                res.append(item)
            temp = res[-1][1]
        return res

