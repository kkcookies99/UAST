 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        res = []
        intervals.sort(key=lambda x:x[0])
        temp = [intervals[0][0], intervals[0][1]]
        for a in intervals:
            if temp[1] < a[0]:
                res.append(temp)
                temp = [a[0], a[1]]
            elif temp[1] < a[1]:
                temp[1] = a[1]
        res.append(temp)
        return res


