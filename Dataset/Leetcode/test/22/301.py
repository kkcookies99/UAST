 class Solution:
    def XXX(self, n: int) -> List[str]:
        path=[]
        ans=[]
        def check(l:int,r:int):
            if len(path)==2*n:
                res=''.join(path.copy())
                ans.append(res)
                return;
            if l==r:
                path.append('(')
                l+=1
                check(l,r)
                l-=1
                path.pop()
            elif l>r:
                if l<n:
                    path.append('(')
                    l+=1
                    check(l,r)
                    l-=1
                    path.pop()
                path.append(')')
                r+=1
                check(l,r)
                r-=1
                path.pop()
        check(0,0)
        return ans

