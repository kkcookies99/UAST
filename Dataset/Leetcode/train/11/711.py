 class Solution(object):
    def XXX_0(self,heights):
        n=len(heights)
        stk1=[]
        stk2=[]
        # 单调栈
        for i in range(n):
            if stk1==[] or heights[stk1[-1]]<heights[i]:
                stk1.append(i)
        for i in range(n-1,-1,-1):
            if stk2==[] or heights[stk2[-1]]<heights[i]:
                stk2.append(i)
        res=0
        for i1 in range(len(stk1)):
            for i2 in range(len(stk2)):
                cur=(stk2[i2]-stk1[i1])*min(heights[stk1[i1]],heights[stk2[i2]])
                res=max(res,cur)
        return res

