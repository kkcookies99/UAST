 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        ans = '1'
        for _ in range(n - 1):
            arr = [0, ans[0]]
            for c in ans:
                if arr[-1] == c:
                    arr[-2] += 1
                else:
                    arr.append(1)
                    arr.append(c)
            ans = ''.join([str(c) for c in arr])
        
        return ans

