 class Solution:
    def XXX(self, n: int) -> List[str]:
        l=[]
        def getthefuckanswer(l,a,i,j):
            if i==0:
                for k in range(j):
                    a+=')'
                l.append(a)
            elif i<j:
                k,m,n=a,i,j
                getthefuckanswer(l,a+')',i,j-1)
                getthefuckanswer(l,k+'(',m-1,n)
            else:
                getthefuckanswer(l,a+'(',i-1,j)
        getthefuckanswer(l,'',n,n)
        return l
code block

