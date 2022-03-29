 class Solution:
    def XXX(self, s: str) -> int:
        dic = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        res = dic[s[-1]]
        for i in range(len(s)-2, -1, -1):
            if dic[s[i]] < dic[s[i+1]]:
                res -= dic[s[i]]
            else:
                res += dic[s[i]]
        return res


