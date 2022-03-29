 class Solution:
    def XXX(self, s: str) -> str:
        temp,L =[s],0
        for x in range(len(s)):
            for y in range(L,len(s)-x+1):
                Str = s[x:x+y]
                if Str == Str[::-1] and y>=L:
                    L=y
                    temp.append(Str)
        return temp[-1]

