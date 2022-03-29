 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key = lambda d:d[0])
        res = []
        i = 1
        while i<=len(intervals):
            left = intervals[i-1][0]
            right = intervals[i-1][1]
            while i<=len(intervals)-1 and right>=intervals[i][0]:
                right = max(right,intervals[i][1])
                i += 1
            res.append([left,right])
            i+=1
        return res

