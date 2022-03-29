 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        seg = []
        for l, r in intervals:
            if seg and seg[-1][1] >= l:
                seg[-1][1] = max(seg[-1][1], r)
            else:
                seg.append([l, r])

        return seg

