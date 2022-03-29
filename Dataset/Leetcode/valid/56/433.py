 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals,key = lambda x:x[0])
        self.res = [] 
        
        def add(x,y):
            #return [] 
            #return [] [] 
            if x[1] >= y[0] and x[1]<=y[1]:
                return [[x[0],y[1]]]
            elif x[1] > y[1]:
                return [x]
            elif x[1] < y[0]:
                return [x,y] 

        idx = 1 
        last = intervals[0]
        while idx < len(intervals):
            t = add(last,intervals[idx])
            if len(t) == 1:
                last = t[0]
            elif len(t) == 2:
                self.res.append(t[0])
                last = t[1]
            idx += 1 
        self.res.append(last)
        return self.res

