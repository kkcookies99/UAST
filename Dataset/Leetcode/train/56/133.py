 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        res=[]
        if not intervals:
            return res
        if len(intervals)==1:
            return intervals

        def union(A,B):
            if A[1]>=B[0]:
                if A[1]>B[1]:
                    return [A[0],A[1]],True
                else:
                    return [A[0],B[1]],True
            else:
                return A,False
        
        first,flag=union(intervals[0],intervals[1])
        res.append(first)

        if flag==False:
             res.append(intervals[1])
            
        if len(intervals)==2:   
                return res

        i=2
        while i <len(intervals):
                tmp,flag=union(res[-1],intervals[i])
                if flag==True:
                    res[-1]=tmp
                elif flag==False:
                    res.append(intervals[i])   
                i+=1
                
        return res

