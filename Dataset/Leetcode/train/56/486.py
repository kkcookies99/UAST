 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x:x[0])
        n = len(intervals)
        i = 1
        while i < n:
            if intervals[i][0] > intervals[i-1][1]:
                i += 1
                continue
            elif intervals[i][0] == intervals[i-1][1] or intervals[i][1] > intervals[i-1][1]:
                intervals[i-1] = [intervals[i-1][0],intervals[i][1]]
            n -= 1
            intervals.pop(i)
        
        return intervals

