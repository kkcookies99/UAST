 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        result = []
        # 嵌套列表排序
        intervals =sorted(intervals, key=lambda x: x[0])
        compare = intervals[0]
        for interval in intervals:
            if compare[1] >= interval[0]:
                compare = [compare[0], max(compare[1], interval[1])]
            else:
                result.append(compare)
                compare = interval
        # 最后加上尾巴
        result.append(compare)
        return result

