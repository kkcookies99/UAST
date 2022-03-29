 class Solution:
    def XXX(self, n: int) -> List[str]:
        res=[]
        def backtrace(s: str,left: int,right: int):
            if left==n and right==n:
                res.append(s)
            if left<n:backtrace(s+"(",left+1,right)
            if right<left:backtrace(s+")",left,right+1)
        backtrace("",0,0)
        return res

