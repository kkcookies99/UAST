 class Solution:
    def XXX(self, prices: List[int]) -> int:
        dp = [0] * len(prices)  #dp[i]代表当天的抛出价格和这之前最小购入价格之差
        min_pric = float('inf')
        for i in range(len(prices)):
            temp = min(min_pric, prices[i])
            dp[i] = prices[i] - temp
            min_pric = temp
        ans = max(dp)
        return 0 if ans<=0 else ans

