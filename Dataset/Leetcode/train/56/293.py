 class Solution(object):
    def XXX(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort(key=lambda x: x[0])
        ans = []
        start = intervals[0][0]
        end = intervals[0][1]
        i = 1
        while i < len(intervals):
            this = intervals[i]
            if this[0] <= end:
                end = max(end, this[1])
            else:
                ans.append([start, end])
                start = this[0]
                end = this[1]
            i+=1
        ans.append([start, end])
        return ans


