 class Solution(object):
    def XXX(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        # sort intervals by start time #
        intervals = sorted(intervals, key=lambda x: x[0])
        n  = len(intervals)
        stk = [intervals[0]]
        for i in range(1, n):
            node = stk.pop()
            if node[1] >= intervals[i][0]:
                new = [node[0], max(intervals[i][1],node[1])]
                stk.append(new) 
            else:
                stk.append(node)
                stk.append(intervals[i]) 
        return stk

