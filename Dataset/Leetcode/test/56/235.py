 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x:x[0])
        ans = list()
        left, right = intervals[0][0], intervals[0][1]
        for i in range(len(intervals)):
            if intervals[i][0]<=right and intervals[i][1]<=right:
                pass
            elif intervals[i][0]<=right and intervals[i][1]>right:
                right = intervals[i][1]
            elif intervals[i][0]>right:
                ans.append([left,right])
                left = intervals[i][0]
                right = intervals[i][1]
        ans.append([left,right])
        return ans

