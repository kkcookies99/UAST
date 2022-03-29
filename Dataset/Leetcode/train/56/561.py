 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        pre_start = intervals[0][0]
        pre_end = intervals[0][1]
        result = []
        for i in range(1,len(intervals)):
            curr_start = intervals[i][0]
            curr_end = intervals[i][1]
            if pre_end>= curr_start:
                pre_end = max(pre_end,curr_end)
            else:
                result.append([pre_start,pre_end])
                pre_start = curr_start
                pre_end = curr_end
        result.append([pre_start,pre_end])
        return result

