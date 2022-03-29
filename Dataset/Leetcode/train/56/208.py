 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        
        n = len(intervals)
        if n == 1:
            return intervals
        intervals.sort()
        l1 = []
        i = 0

        while i < n:

            if i == n-1:
                l1.append(intervals[i])
                break

            if intervals[i][1] >= intervals[i+1][0]:
                i += 1
                intervals[i][0] = intervals[i-1][0]
                intervals[i][1] = intervals[i-1][1] if intervals[i-1][1]>intervals[i][1] else intervals[i][1]

            else:
                l1.append(intervals[i])
                i += 1
                
        return l1
        

