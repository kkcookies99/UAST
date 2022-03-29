class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        res = '1'
        for i in range(2, n+1):
            ans = ''
            j = 0
            while j < len(res):
                k = j
                while k < len(res)-1 and res[k] == res[k+1]:
                    k+=1
                ans += str(k+1-j)+res[k]
                j = k+1
            res = ans
        return res

