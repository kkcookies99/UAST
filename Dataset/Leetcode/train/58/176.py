 class Solution:
    def XXX(self, s: str) -> int:
        m=0
        lastl=0
        l=0
        for i in s:
            if i !=' ':
                l+=1
                m+=1
                lastl=l
            if i==' ':
                if l!=0:
                    lastl=l
                    l=0
        if m==0:
            return 0
        return lastl

