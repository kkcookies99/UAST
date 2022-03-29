 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        # 1 start升序 2 end降序
        # 相邻区间只有三种情况 1 覆盖 2 相交->可合并 3 不相交
        n = len(intervals)
        intervals.sort(key=lambda x: (x[0], -x[1]))
        # print(intervals)
        cur_start, cur_end = intervals[0]
        res = [intervals[0]]
        for i in range(1, n):
            next_start, next_end = intervals[i]
            if next_end < cur_end:  # 覆盖
                continue
            elif next_start <= cur_end:  # 可合并
                res.pop()
                res.append([cur_start, next_end])
                next_start = cur_start
            elif next_start > cur_end:
                res.append([next_start, next_end])
            cur_start, cur_end = next_start, next_end
        return res

