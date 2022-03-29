 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        if not intervals:
            return []
        intervals = sorted(intervals)
        ans = [intervals[0]]
        for i in intervals[1:]:
            if ans[-1][1] >= i[0]:
                tmp = ans.pop()
                ans.append([tmp[0],max(i[1],tmp[1])])
            else:
                ans.append(i)
        return ans

