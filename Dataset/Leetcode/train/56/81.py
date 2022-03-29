class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])      
        ana = []
        left,right = intervals[0][0],intervals[0][1]
        for i in range(len(intervals)-1):
            if right<intervals[i+1][0]:
                ana.append([left,right])
                left,right = intervals[i+1][0],intervals[i+1][1]
            else:
                right = max(right,intervals[i+1][1])
        ana.append([left,right])
        return ana

