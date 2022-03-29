 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        tmp_start = intervals[0][0]
        tmp_end = intervals[0][1]
        ans = [intervals[0]]
        for i in range(1,len(intervals)):
            if intervals[i][0]>=tmp_start and intervals[i][1]<=tmp_end:
                continue
            elif intervals[i][0]<=tmp_end and intervals[i][1]>=tmp_end:
                tmp_end = intervals[i][1]
                ans[-1] = [tmp_start,tmp_end]
            else:
                tmp_start = intervals[i][0]
                tmp_end = intervals[i][1]
                ans.append([tmp_start,tmp_end])            
        return ans```

