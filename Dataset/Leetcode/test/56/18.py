class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x:x[0])
        res = [] 
        res.append(intervals[0])
        for i in range(1,len(intervals)):
            temp = res.pop(-1)
            t1,t2 = self.mer(temp,intervals[i])
            if t1 and t2:
                res.append(t1)
                res.append(t2)
            elif t1 and not t2:
                res.append(t1)
        return res         
    def mer(self,a,b):
        if a[1] < b[0]:
            return a,b
        elif a[1] == b[0]:
            return [a[0],b[1]],None
        elif a[1] > b[0] and a[1] <= b[1]:
            return [a[0],b[1]],None
        elif a[1] > b[0] and a[1] > b[1]:
            return a,None         

