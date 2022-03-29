 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        res = []
        st, ed = float('-inf'), float('-inf')
        for interval in intervals:
            if ed < interval[0]:
                if st != float('-inf'):
                    res.append([st, ed])
                st, ed = interval[0], interval[1]
            else:
                ed = max(ed, interval[1])
        if st != float('-inf'):
            res.append([st, ed])

        return res

