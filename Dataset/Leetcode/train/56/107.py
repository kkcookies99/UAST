 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(reverse = True)
        for i in range(len(intervals)-1,0,-1):
            if (intervals[i][0] <= intervals[i-1][1])&(intervals[i][1] >= intervals[i-1][0]):
                intervals[i-1] = [min(intervals[i]+intervals[i-1]),max(intervals[i]+intervals[i-1])]
                intervals.pop(i)
        return intervals

