 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        n = len(intervals)
        if n <= 1:
            return intervals
        intervals.sort()

        ans = []
        mn, mx = intervals[0][0], intervals[0][1]
        for i in range(1, n):
            if intervals[i][0] > mx:
                ans.append([mn, mx])
                mn, mx = intervals[i][0], intervals[i][1]
            else:
                mn, mx = min(mn, intervals[i][0]), max(mx, intervals[i][1])
            
        ans.append([mn, mx])
        return ans


