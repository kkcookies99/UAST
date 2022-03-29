 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        res = []
        intervals.sort(key=lambda x:x[0])
        i = 0
        while i < len(intervals):
            XXX_interval = intervals[i]
            j = i + 1
            while j < len(intervals) and XXX_interval[1] >= intervals[j][0]:
                    XXX_interval[1] = max(XXX_interval[1],intervals[j][1])
                    j += 1
            res.append(XXX_interval)
            i = j
        return res
        

