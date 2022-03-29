 class Solution:
    def XXX(self, s: str) -> str:
        for i in range(len(s),0,-1):
            for j in range(0,len(s)-i+2):
                pal=s[j:j+i]
                if pal[::-1]==pal:
                    return pal

