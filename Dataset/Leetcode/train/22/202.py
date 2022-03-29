 class Solution:
    def XXX(self, n: int) -> List[str]:
        ans=[["()"]]
        if n==1:return ans[n-1]
        
        for i in range(1,8):
            d={}
            t=[]
            words=ans[i-1]
            for word in words:
                for j in range(len(word)+1):
                    new="".join(word[0:j])+"()"+"".join(word[j:])
                    if not d.__contains__(new):
                        t.append(new)
                        d[new]=None
            if i==(n-1):return t    
            ans.append(t)

