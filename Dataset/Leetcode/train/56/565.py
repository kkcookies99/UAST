 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        # 先排序，再遍历集合，对比每个区间的尾部和其后继区间的头部，如果尾>=头，则合并
        intervals = sorted(intervals, key = lambda x:x[0])
        n = len(intervals)
        for i  in range(1, n):
            if intervals[i-1][1] >=intervals[i][0]:
                intervals[i] = [intervals[i-1][0], max(intervals[i][1], intervals[i-1][1])]  # 需要考虑右边界的大小
                intervals[i-1] = None
        return [item for item in intervals if item]

