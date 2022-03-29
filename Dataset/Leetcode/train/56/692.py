 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        l = len(intervals)
        if l < 2:
            return intervals
        lst = sorted(reduce(lambda x,y:x|y, map(lambda x:set(range(x[0]*2,x[1]*2+1)), intervals)))
        ret = []
        i = 0
        while i < len(lst):
            t = [lst[i] // 2]
            i += 1
            while i < len(lst) and lst[i] - lst[i-1] == 1:
                i += 1
            t.append(lst[i-1] // 2)
            ret.append(t)
        return ret

