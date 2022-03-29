class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        n = len(intervals)
        if n<=1: return intervals
        intervals.sort(key = lambda x:x[0])#按照开头排序
        
        res = [intervals[0]]#加入最小
        for item in intervals:
            if item[0]<=res[-1][1]:#后一段的开始时间
                #加一个max，考虑了套娃情况，e.g.[[1,4],[2,3]]
                res[-1] = [res[-1][0],max(item[1],res[-1][1])]
            else:
                res.append(item)
        return res

