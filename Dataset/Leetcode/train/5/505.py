 class Solution:
    def XXX(self, s: str) -> str:
        if len(s) == 1:
            return s
        s = "#" + "#".join(s) + "#"
        n = len(s)
        Max = 0
        for i in range(n):
            length = maxlen(s, i)
            if length > Max:
                Max = length
                ipos = i
        start = ipos - Max//2
        end = ipos + Max//2
        ans = s[start:end+1]
        return ans.replace("#","")
        

def maxlen(s, i):
    l = r = i
    while l>=0 and r <len(s) and s[l] == s[r]:
        l -= 1
        r += 1
    return r-l-1

