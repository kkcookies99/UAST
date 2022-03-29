 class Solution(object):
    def XXX(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals=sorted(intervals,key=lambda x:x[0])
        result=[intervals[0]]
        for i in range(1,len(intervals)):
            if intervals[i][0]<=result[-1][1]:
                if intervals[i][1]>=result[-1][1]:
                    result[-1][1]=intervals[i][1]
            else:
                result.append(intervals[i])
        return result

