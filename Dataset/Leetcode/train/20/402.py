 class Solution:
    def XXX(self, s: str) -> bool:
        N=10010
        stk=[0]*N
        tt=0
        pairs={
            ')':'(',
            ']':'[',
            '}':'{',
        }

        for i in range(len(s)):
            if s[i] not in pairs:
                tt+=1
                stk[tt]=s[i]
            
            else:
                if pairs[s[i]] != stk[tt]:
                    return False
                else:
                    tt-=1
        return tt==0

