class Solution:
    def XXX(self, s: str) -> int:
        m = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        ans = 0
        tmp=s+"I"#添加哨兵
        for i in range(len(s)):
            if  m[tmp[i]] >=m[tmp[i+1]]:#前比後大或相等加上
                ans +=m[tmp[i]]
            else:
                    ans-=m[tmp[i]]#前比後小減去
        return ans

