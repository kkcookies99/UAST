 class Solution:
    def XXX(self, strs: List[str]) -> str:
        ans=''
        n=min(len(s) for s in strs)
        for i in range(n):
            lis=[s[i] for s in strs]
            if len(set(lis))==1:
                ans+=lis[0]
            else:
                break
        return ans 

