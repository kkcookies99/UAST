 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals) == 1:
            return intervals
        intervals.sort()
        result = [intervals[0]]
        for i in range(1, len(intervals)):
            # 总共三种情况需要考虑，比较两个区间，另两个区间中的元素值依次为a,b,c,d。
            temp = result.pop()
            cur = intervals[i]
            # 当b>=c 或 c<=d,区间首尾取a,d
            if temp[1] >= cur[0] and temp[1] <= cur[1]:
                result.append([temp[0], cur[1]])
            # 当b>d, 区间首尾取a,b
            elif temp[1] > cur[1]:
                result.append(temp)
            # 此种情况下无重叠
            else:
                result.extend([temp, cur])
        return result

