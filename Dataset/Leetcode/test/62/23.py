 class Solution:
    def XXX(self, m: int, n: int) -> int:
        """
             ans = ((m-1 + n-1))!/(m-1)!(n-1)!
        """
        def factor(num):
            if num < 2:
                return 1
            res = 1
            for i in range(1, num+1):
                res *= i
            return res
        
        ans = factor(m+n-2) // (factor(m-1) * factor(n-1))
        return ans

