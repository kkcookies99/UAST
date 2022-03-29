 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if prices[::-1] == sorted(prices):
            return 0

        n = len(prices)
        ans = 0
        for i in range(n - 1):
            for j in range(i+1, n):
                tmp = prices[j] - prices[i]
                ans = max(tmp, ans)
        return ans

