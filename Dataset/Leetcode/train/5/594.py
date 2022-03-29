 class Solution:
    def XXX(self, s: str) -> str:
        nmax = ""
        max=0
        for i in range(len(s)):
            for j in range(i+1, len(s)):
                if s[j]==s[i]:
                    n, lenth = s[i:j+1], j-i+1
                    if n==n[::-1] and max<lenth:
                            max = lenth
                            nmax = n
        if nmax == "":
            nmax = s[0]
        return nmax

