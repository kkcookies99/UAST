 class Solution:
    def XXX(self, s: str) -> int:
        start=-1
        max=0
        d={}
        for i in range(len(s)):
            if s[i] in d and d[s[i]]>start:
                 start=d[s[i]]
                 d[s[i]]=i
            else:
                d[s[i]]=i
                if i-start>max:
                    max=i-start
        return max

