 def XXX(self, n: int) -> List[str]:
    ans=[]

    def generateP(left,right,s):
        if right==n:
            ans.append(s)
        if left<n:
            generateP(left+1,right,s+'(')
        if right<left:
            generateP(left,right+1,s+')')

    generateP(0,0,'')
    return ans.

