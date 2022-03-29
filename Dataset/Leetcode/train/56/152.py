 class Solution:
    def XXX(self, intervals: List[Interval]) -> List[Interval]:
        if len(intervals) <= 1:
            return intervals
        intervals.sort()
        res_list = [intervals[0]]
        for i in range(1, len(intervals)):
            if res_list[-1][1] >= intervals[i][0]:
                res_list[-1][1] = max(intervals[i][1], res_list[-1][1])
            else:
                res_list.append(intervals[i])
        return res_list

