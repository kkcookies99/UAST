 class Solution:
    def __init__(self):
        self.dp = dict(zip((0, 1), ([''], ['()'])))

    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if n not in self.dp:
            self.dp[n] = ['(' + sl + ')' + sr for m in range(n) for sl in self.XXX(m) for sr in self.XXX((n - 1) - m)]
            
        return self.dp[n]

