 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        res = [ ]
        #根据左侧区间进行排序，贪心，左侧区间越小，越有机会与前面的区间进行合并
        intervals = sorted(intervals, key = lambda x : x[0])
        cover = intervals[0][1]
        minleft = intervals[0][0]
        #由左向右遍历合并
        for i in range(1,len(intervals)):
            if intervals[i][0] <= cover:
                minleft = min(minleft,intervals[i][0])
                cover = max(cover,intervals[i][1])
            else:
                res.append([minleft,cover])
                cover = intervals[i][1]
                minleft = intervals[i][0]
        res.append([minleft,cover])    
        return res

