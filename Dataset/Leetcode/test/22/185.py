 class Solution:
    def XXX(self, n: int) -> List[str]:
        pre_res=["()"]
        if n==1:
            return pre_res
        for i in range(2,n+1):
          #  print(i,pre_res)
            res=[]
            for j in range(len(pre_res)):
                cur=pre_res[j]
                for k in range(len(cur)):
                    if cur[k]=='(':
                        res.append(cur[:k+1]+"()"+cur[k+1:])
                res.append("()"+cur)
            pre_res=list(set(res))
        return pre_res

