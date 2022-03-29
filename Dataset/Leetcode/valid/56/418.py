 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals, key=lambda x:x[0])
        res = []
        temp = intervals[0]
        for i in range(1, len(intervals)):
            cur = intervals[i]
            if cur[0] > temp[1]:
                res.append(temp)
                temp = cur
            else:
                if cur[1] > temp[1]:
                    temp[1] = cur[1]
        res.append(temp)
        return res

