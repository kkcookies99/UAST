 class Solution(object):
    def XXX(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        res=[]
        intervals=sorted(intervals,key=lambda x:(x[0],x[1]))
        # print(intervals)
        res.append(intervals[0])
        for i in range(1,len(intervals)):
            if res[-1][1]<intervals[i][0]:
                res.append(intervals[i])
            elif res[-1][1]<=intervals[i][1] and res[-1][0]>=intervals[i][0]:
                res[-1]=intervals[i]
            elif res[-1][1]>=intervals[i][1] and res[-1][0]<=intervals[i][0]:
                pass
            else:
                res[-1][1]=intervals[i][1]
        return res

