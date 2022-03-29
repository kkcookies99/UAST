class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        i = 0
        ans = '1'
        while i < n-1:
            ans = self.describe(ans)
            i += 1
        return ans
            
    def describe(self, s):
        if len(s) == 1:
            return '1' + s
        l, r = 0, 1
        res = ''
        while r < len(s):
            count = 1
            while r < len(s) and s[r] == s[l]:
                count += 1
                r += 1
            res += str(count) + s[l]
            l = r
            r = l + 1
            if l == len(s) - 1:
                res += '1' + str(s[-1])
                break
        return res

