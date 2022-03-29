 class Solution:
    def XXX(self, s: str) -> str:
        s='#'+'#'.join(s)+'#'
        RL=[0]*len(s)
        MaxRight=0
        pos=0
        MaxLen=0
        for i in range(len(s)):
            if i<MaxRight:
                RL[i]=min(RL[2*pos-i], MaxRight-i)
            else:
                RL[i]=1
            while i-RL[i]>=0 and i+RL[i]<len(s) and s[i-RL[i]]==s[i+RL[i]]:
                RL[i]+=1
            if RL[i]+i-1>MaxRight:
                MaxRight=RL[i]+i-1
                pos=i
            MaxLen=max(MaxLen, RL[i])
        return s[RL.index(max(RL))-MaxLen+2:RL.index(max(RL))+MaxLen-1:2]

