 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        indexs = [None] * 10000
        for i in range(len(intervals)):
            sid = intervals[i][0]
            if indexs[sid] is None:
                indexs[sid] = [i]
            else:
                indexs[sid] = indexs[sid] + [i]
        # 按每个区间的开始值大小排序重建intervals
        sorted_intervals = []
        for ids in indexs:
            if ids is not None:
                for j in ids:
                    sorted_intervals.append(intervals[j])
        result = []
        base = sorted_intervals[0]
        for a in sorted_intervals:
            if a[0] <= base[0]: # 交换base区间
                tmp = base 
                base = a
                a = tmp 
            if base[1] >= a[0] and base[1] <= a[1]:
                base[1] = a[1]
                continue 
            if base[1] < a[0]:
                result.append(base)
                base = a
        result.append(base)
        return result

