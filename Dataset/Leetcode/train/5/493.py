 class Solution:
    def XXX(self, s: str) -> str:
        for lenght in range(len(s),1,-1):
            for start in range(len(s)-lenght+1):
                str=s[start:start+lenght]
                if str[::-1]==str:
                    return str
        return s[0]

