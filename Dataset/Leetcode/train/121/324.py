 class Solution:
    def XXX(self, prices: List[int]) -> int:
        ans = 0
        pre_min = prices[0]

        for i in range(1, len(prices)):
            ans = max(ans, prices[i] - pre_min)
            pre_min = min(pre_min, prices[i])
        return ans

