 class Solution:
    def XXX(self, s: str) -> int:
        dic = {'M':1000, 'CM':900,'D':500,'CD':400,'C':100,'XC':90,'L':50,'XL':40, 'X':10,'IX':9,'V':5, 'IV':4, 'I':1}
        res = 0
    
        while s :
            if len(s) >=2 and s[0:2] in dic:
                res = res +dic[s[0:2]]
                s = s[2:]
            
            else:
                res = res + dic[s[0]]
                s = s[1:]

        return res


