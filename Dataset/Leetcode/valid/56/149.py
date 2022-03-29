 class Solution(object):
    def XXX(self, intervals):
        """
     轻松秒杀，根据结果集合最后一个和新的元素之间关系判断是否要修改
        """
        if not intervals: return []
        intervals = sorted(intervals)
        res = [intervals[0]]
        for i in range(1, len(intervals)):
            if intervals[i][0] <= res[-1][1]: 
                res[-1] = [res[-1][0],max(res[-1][1], intervals[i][1])]
            else:
                res.append(intervals[i])
        return res

