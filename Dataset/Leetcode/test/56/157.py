 class Solution:
    def XXX(self, intervals: List[Interval]) -> List[Interval]:
        answer=[]
        if len(intervals)==0:
            return answer
        intervals=sorted(intervals,key=lambda interval:interval.start)
        
        answer.append(intervals[0])
        for interval in intervals[1:]:
            if interval.start>answer[-1].end:
                answer.append(interval)
            elif interval.end<=answer[-1].end:
                continue
            else:
                new_interval=Interval(answer[-1].start,interval.end)
                answer.pop()
                answer.append(new_interval)
        
        return answer

