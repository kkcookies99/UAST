 class Solution:
    def XXX(self, intervals: List[Interval]) -> List[Interval]:
        if len(intervals) <= 1:
            return intervals
        
        intervals.sort(key=lambda x:x.start)
        b = []
        b.append(intervals[0])
        right = intervals[0].end
        for item in intervals[1:]:
            
            if right >= item.start :
                right = max(right, item.end)
                b[-1].end = right
       
            else:
                b[-1].end = right
                b.append(item)
                right = item.end
                
        return b

