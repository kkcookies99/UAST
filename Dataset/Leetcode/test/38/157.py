class Solution:
    def XXX(self, n: int) -> str:
        ans = '1'
        pattern = r'((\d)(\2*))'
        while n > 1:
            n -= 1
            s = re.findall(pattern,ans)
            ans = ''
            for i in s:
                ans += str(len(i[0])) + i[0][0]
        return ans

