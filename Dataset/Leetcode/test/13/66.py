class Solution:
    s_v = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
    cs_v = {'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
    def XXX(self, s: str) -> int:
        index = 0
        res = 0
        while index < len(s):
            if index + 1 <= len(s) -1:
                v = self.cs_v.get(s[index:index+2])
                if v != None:
                    res += v
                    index += 2
                    continue
            
            res += self.s_v[s[index]]
            index += 1
        return res

