class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        if not intervals: return []
        intervals.sort(key = lambda x:x[0]) #根据左区间排序，之后就只用看右区间了
        ress = []
        key = False
        i = 0
        while i < len(intervals)-1:
            res = intervals[i]
            while i < len(intervals)-1 and res[1] >= intervals[i+1][0]:
                res[0] = res[0]
                res[1] = max(intervals[i+1][1], res[1])
                if i == len(intervals)-2: key=True
                i+=1 #跳过被合并的区间
            ress.append(res)
            i+=1 #进入下一组重新开始比较
        if not key:
            ress.append(intervals[-1])
        return ress
        


