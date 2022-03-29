 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        # 前一个合并区间
        pre = intervals[0]
        res = []
        for i in range(1, len(intervals)):
            # 发生重叠
            if intervals[i][0] <= pre[1]:
                # 合并，更新pre结束位置
                if intervals[i][1] > pre[1]:
                    pre[1] = intervals[i][1]
            else:
                res.append(pre)
                pre = intervals[i]
        # 最后一个没有加进去
        res.append(pre)
        return res

