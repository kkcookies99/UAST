 class Solution:
    def XXX(self, s: str) -> str:
        l = len(s)
        res= ''
        while l > 0:
            for i in range(len(s)-l+1):
                if s[i:l+i] == s[i:l+i][::-1]:
                    res = s[i:l+i]
                    return res
            l-=1

