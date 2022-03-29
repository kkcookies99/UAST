 class Solution(object):
    def XXX(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort(key=lambda x:x[0])
        slow = fast = 0 
        while fast < len(intervals):
            if intervals[fast][0] <= intervals[slow][1]:
                intervals[slow][1] = max(intervals[fast][1], intervals[slow][1])
            else:
                slow += 1
                intervals[slow] = intervals[fast]
            fast += 1

        return intervals[:slow+1]

