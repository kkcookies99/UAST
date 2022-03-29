 class Solution:
    #[7,1,5,3,6,4]
    # [7] 0
    # [7,1] 0
    # [7, 1, 5]: 4
    # [7, 1, 5, 3]: 2
    # dp[n] = min(dp[n-1], prices[i] - cost)
    def XXX(self, prices: List[int]) -> int:
        cost = prices[0]
        dp = 0
        for i in range(1,len(prices),1):
            dp = max(dp, prices[i] - cost)
            if prices[i] < cost:
                cost = prices[i]
        return dp

