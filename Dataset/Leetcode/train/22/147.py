 class Solution:
    def XXX(self, n: int) -> List[str]:
        ans=[]
        def build(curleft:int,curright:int,bracket:List[str]):
            if curleft == curright==n:
                ans.append("".join(bracket))
                return
            if curleft == n:
                bracket.append(')')
                build(curleft,curright+1,bracket)
                bracket.pop()
                return
            bracket.append('(')
            build(curleft+1,curright,bracket)
            bracket.pop()
            if curright<curleft:
                bracket.append(')')
                build(curleft, curright+1, bracket)
                bracket.pop()
        build(0,0,[])
        return ans

