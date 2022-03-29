 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
   
        ans = list()
        start, end = intervals[0][0], intervals[0][1] #表示上一个区间， 同时也是更新答案的区间
        for i, interval in enumerate(intervals):
            if i == 0: continue
            s, e =  interval[0], interval[1]
            if s <= end:
                end = max(e, end)
            else:
                ans.append([start, end])
                start, end = s, e
        ans.append([start, end])
        return ans

