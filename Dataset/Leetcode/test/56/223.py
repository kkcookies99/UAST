 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        """
        求解思路：指针+队列+排序
        """

        # 首先将输入列表排序
        intervals.sort()

        # 遍历指针
        idx = 1
        # 将第一个区间添加到结果列表
        res = [intervals[0]]
        # 遍历
        while idx < len(intervals):
            # 取出第一个区间
            interval = res.pop()
            # 将第二个区间与第一个区间进行比较，区间有交叉1
            if interval[0] <= intervals[idx][0] <= interval[1] and intervals[idx][1] >= interval[1]:    # 去重
                if [interval[0], intervals[idx][1]] not in res:
                    res.append([interval[0], intervals[idx][1]])
                    idx += 1
            # 区间有交叉2
            elif interval[0] >= intervals[idx][0] and interval[1] >= intervals[idx][1]:
                if [intervals[idx][0], interval[1]] not in res:
                    res.append([intervals[idx][0], interval[1]])
                    idx += 1
            # 包裹区间1
            elif interval[0] >= intervals[idx][0] and interval[1] <= intervals[idx][1]:
                if interval not in res:
                    res.append(intervals[idx])
                    idx += 1
            # 包裹区间2
            elif interval[0] <= intervals[idx][0] and interval[1] >= intervals[idx][1]:
                if intervals[idx] not in res:
                    res.append(interval)
                    idx += 1
            else:
                res.append(interval)
                res.append(intervals[idx])
                idx += 1

        return res

