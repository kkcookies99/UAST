 class Solution:
    def XXX(self, intervals: List[Interval]) -> List[Interval]:
        cur = 0
        intervals.sort(key=lambda x:x.start)
        while cur < (len(intervals)-1):
            if intervals[cur].end >= intervals[cur+1].start:
                intervals[cur].end = intervals[cur+1].end if intervals[cur+1].end>intervals[cur].end else intervals[cur].end 
                intervals.pop(cur+1)
                continue
            cur += 1
        return intervals

