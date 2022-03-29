 class Solution:
    def XXX(self, s: str) -> int: 
        n=len(s)
        res=0
        for i in range(n):
            rep=list()
            account=0
            for j in range(i,n,1):
                if s[j] not in rep:
                    rep.append(s[j])
                    account+=1
                    res=max(res, account)
                else:
                    res=max(res,account)
                    rep.clear()
                    break

        return res

