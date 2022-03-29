 class Solution:
    def XXX(self, intervals: List[Interval]) -> List[Interval]:
        l = len(intervals)
        if l < 2:
            return intervals
        
#         先对区间排序，按照区间头升序、相同区间头按区间尾升序，得到的序列有几种情况：
#         1. cur.start < next.start and cur.end < next.end:
#            (1) cur.end >= next.start
#                两个区间有交集
#            (2) cur.end < next.start
#                两个区间无交集
#         2. cur.start < next.start and cur.end >= next.end:
#            第二个区间被第一个区间包含，这种情况下cur.end >= next.start
#         3. cur.start == next.start and cur.end <= next.end:
#            第一个区间被第二个区间包含，这种情况下cur.end >= next.start
        
#         cur.end >= next.start可作为两个区间有交集的依据，合并后的区间头就是cur.start，区间尾要选两者中较大的
        
        sortedi = sorted(intervals, key=lambda a:(a.start, a.end))
        ret = []
        cur = sortedi[0]
        i = 1
        while i < l:
            if cur.end >= sortedi[i].start:
                cur.end = max(sortedi[i].end, cur.end)
            else:
                ret.append(cur)
                cur = sortedi[i]
            i += 1
        ret.append(cur)
        return ret

