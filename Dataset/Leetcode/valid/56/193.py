 class Solution(object):
    def XXX(self, intervals):
        intervals.sort(key=lambda x : x[0] )
        l=len(intervals)
        res=[]
        i=0
        while i < l :
            if i==l-1 :
                res.append(intervals[i])
                break
            while intervals[i][1]>=intervals[i+1][0] :
                intervals[i+1][0]=intervals[i][0]
                intervals[i+1][1]=max(intervals[i][1],intervals[i+1][1])
                i+=1
                if i==l-1 :
                    break
            res.append(intervals[i])
            i+=1
        return res


