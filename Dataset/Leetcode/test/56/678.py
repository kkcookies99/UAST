 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        #按intervals[i][0]排序 比较[i][1]与[i+1][0]谁大谁小
        #如果[i][1]>=[i+1][0]说明有重叠  此时[i][1]取[i][1]和[i+1][1]中更大的那个 
        #如果[i][1]<[i+1][0] 说明无重叠 此时i+1
        #停止条件 i = n
        intervals.sort(key = lambda x:x[0])
        res = []
        n = len(intervals)
        i = 0
        while i < n:
            left = intervals[i][0]
            right = intervals[i][1]
            while i < n - 1 and right >= intervals[i+1][0]:
                i += 1
                right = max(right,intervals[i][1])
            res.append([left,right])
            i += 1
        return res

